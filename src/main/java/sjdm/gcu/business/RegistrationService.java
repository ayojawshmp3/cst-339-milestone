package sjdm.gcu.business;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Service class for handling user registration.
 */
@Service
public class RegistrationService {

    /**
     * Registers a new user.
     *
     * @param model Model instance to add attributes
     */
    public void registerUser(Model model) {
        model.addAttribute("newUser", "Registration Complete");
    }
}
