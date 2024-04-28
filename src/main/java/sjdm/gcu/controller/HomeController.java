package sjdm.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for handling home-related operations.
 */
@Controller
public class HomeController {

    /**
     * Retrieves the home page.
     *
     * @return String representing the view name
     */
    @GetMapping("/")
    public String home() {
        return "home"; // View name
    }
}
