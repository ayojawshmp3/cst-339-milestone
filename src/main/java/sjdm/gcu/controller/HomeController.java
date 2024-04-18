package sjdm.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/")
	public String home() {
		// view resolver takes the view name returned by the controller ("home") and maps it to a specific view file (home.html) ()
		// returning "home" from the controller method would result in the view resolver looking for a file named home.html in the templates directory.
		return "home"; // View name
	}
}
