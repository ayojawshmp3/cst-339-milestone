package sjdm.gcu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import sjdm.gcu.business.RegistrationService;
import sjdm.gcu.model.LoginModel;
import sjdm.gcu.model.RegisterModel;

/**
 * Controller class for handling registration-related operations.
 */
@Controller
public class RegisterController {

    /**
     * Service for user registration.
     */
    @Autowired
    private RegistrationService registrationService;

    /**
     * Displays the registration form.
     *
     * @param model Model instance
     * @return String representing the view name
     */
    @GetMapping("/register")
    public String display(Model model) {
        model.addAttribute("title", "Register Form");
        model.addAttribute("registerModel", new RegisterModel());
        // Open register.html
        return "register"; // View Name
    }

    /**
     * Processes user registration.
     *
     * @param registerModel RegisterModel instance
     * @param bindingResult BindingResult instance for validation errors
     * @param model Model instance
     * @return String representing the view name
     */
    @PostMapping("/doRegister")
    public String doRegister(@Valid RegisterModel registerModel, BindingResult bindingResult, Model model) {

        // Check for validation errors:
        if (bindingResult.hasErrors()) {
            model.addAttribute("title", "Register Form");
            return "register"; // View Name
        }

        // FOR SOME UNKNOWN REASON this will send you to the login.html page
        model.addAttribute("title", "Login Form");
        model.addAttribute("loginModel", new LoginModel());
        registrationService.registerUser(model);
        // Open login.html
        return "login"; // View Name
    }
}
