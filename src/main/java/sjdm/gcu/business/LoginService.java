package sjdm.gcu.business;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean authenticate(String username, String password) {
        // Example hardcoded credentials
        String validUsername = "admin"; 
        String validPassword = "123";

        return validUsername.equals(username) && validPassword.equals(password);
    }
}