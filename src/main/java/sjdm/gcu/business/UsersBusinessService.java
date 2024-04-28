package sjdm.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sjdm.gcu.data.UsersDataService;
import sjdm.gcu.data.entity.UserEntity;

/**
 * Service class for managing users in the business layer.
 */
@Service
public class UsersBusinessService implements UserDetailsService {

    /**
     * Data service for accessing user data.
     */
    @Autowired
    private UsersDataService service;

    /**
     * Constructor to inject UsersDataService.
     *
     * @param service UsersDataService instance
     */
    public UsersBusinessService(UsersDataService service) {
        super();
        this.service = service;
    }

    /**
     * This method is overridden from the base class and is used to support Spring Security user authentication.
     *
     * @param username the username to load the user by
     * @return UserDetails containing user details
     * @throws UsernameNotFoundException if the username is not found
     */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Try to find the User in the database. If not found, throw a User Not Found exception else return a Spring Security User.
		UserEntity user = service.findByUsername(username);
		if(user != null) {
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("USER"));
			return new User(user.getUsername(), user.getPassword(), authorities);
		}
		else {
			throw new UsernameNotFoundException("username not found");
		}
	}
}