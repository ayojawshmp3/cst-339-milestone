package sjdm.gcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

import sjdm.gcu.business.UsersBusinessService;

@Configuration
public class SecurityConfig {
	
	@Autowired
	private UsersBusinessService service;
	
	/**
	 * Constructor to inject UsersBusinessService.
	 *
	 * @param service UsersBusinessService instance
	 */
	public SecurityConfig(UsersBusinessService service) {
        this.service = service;
    }
	
	/**
	 * Configures security filter chain for HTTP requests.
	 *
	 * @param http HttpSecurity object
	 * @return SecurityFilterChain object
	 * @throws Exception if configuration fails
	 */
	@SuppressWarnings("removal")
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((authz) -> {
				try {
                    authz
                        .requestMatchers("/home", "/product", "/register", "/images/**", "/service/**").permitAll()
                        .anyRequest().authenticated()
                        .and()
                        .formLogin(login -> login
                                .loginPage("/login")
                                .usernameParameter("username")
                                .passwordParameter("password")
                                .permitAll()
                                .defaultSuccessUrl("/app/orders", true))
                        .logout(logout -> logout
                                .logoutUrl("/logout")
                                .invalidateHttpSession(true)
                                .clearAuthentication(true)
                                .permitAll()
                                .logoutSuccessUrl("/"));
				} catch (Exception e) {
					// Exception handling
					e.printStackTrace();
				}
			})
            .httpBasic(withDefaults());
        return http.build();
    }
	
	/**
	 * Customizes HttpBasicConfigurer.
	 *
	 * @return Customizer for HttpBasicConfigurer
	 */
	private Customizer<HttpBasicConfigurer<HttpSecurity>> withDefaults() {
	    return httpBasic -> httpBasic
	            .realmName("Custom Realm")
	            .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));
	}
    
	/**
	 * Configures authentication manager builder.
	 *
	 * @param auth AuthenticationManagerBuilder object
	 * @throws Exception if configuration fails
	 */
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(service)
		.passwordEncoder(passwordEncoder());
	}

	
	/**
	 * Creates an instance of BCryptPasswordEncoder.
	 *
	 * @return BCryptPasswordEncoder instance
	 */
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
