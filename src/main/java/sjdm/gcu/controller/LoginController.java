package sjdm.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for handling login-related operations.
 */
@Controller
public class LoginController {

    /**
     * Displays the login form.
     *
     * @param model Model instance
     * @return String representing the view name
     */
    @GetMapping("/login")
    public String display(Model model) {
        model.addAttribute("title", "Login Form");
        return "login"; // View name
    }

}
