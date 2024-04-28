package sjdm.gcu.business;

import org.springframework.stereotype.Service;

/**
 * Service class for handling login authentication.
 */
@Service
public class LoginService {

    /**
     * Authenticates user credentials.
     *
     * @param username User's username
     * @param password User's password
     * @return true if authentication is successful, false otherwise
     */
    public boolean authenticate(String username, String password) {
        // Example hardcoded credentials
        String validUsername = "admin"; 
        String validPassword = "123";

        return validUsername.equals(username) && validPassword.equals(password);
    }
}
