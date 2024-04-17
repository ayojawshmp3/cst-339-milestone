package sjdm.gcu.business;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class RegistrationService {
    // This method doesn't need to do anything with the data since it's not persisted.
    public void registerUser(Model model) {
		model.addAttribute("newUser", "Registration Complete");
    }
}