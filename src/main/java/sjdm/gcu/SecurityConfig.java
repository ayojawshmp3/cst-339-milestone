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
	
	public SecurityConfig(UsersBusinessService service) {
        this.service = service;
    }
	
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
                                .defaultSuccessUrl("/orders/display", true))
                        .logout(logout -> logout
                                .logoutUrl("/logout")
                                .invalidateHttpSession(true)
                                .clearAuthentication(true)
                                .permitAll()
                                .logoutSuccessUrl("/"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			})
            .httpBasic(withDefaults());
        return http.build();
    }
	
	private Customizer<HttpBasicConfigurer<HttpSecurity>> withDefaults() {
	    return httpBasic -> httpBasic
	            .realmName("Custom Realm")
	            .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));
	}
    
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(service)
		.passwordEncoder(passwordEncoder());
	}
	
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}