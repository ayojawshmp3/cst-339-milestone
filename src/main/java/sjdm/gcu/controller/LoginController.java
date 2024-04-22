package sjdm.gcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sjdm.gcu.business.LoginService;
import sjdm.gcu.business.OrdersBusinessServiceInterface;
import sjdm.gcu.model.LoginModel;
import sjdm.gcu.model.OrderModel;
import jakarta.validation.Valid;

@Controller
public class LoginController {
	
//	@Autowired
//    private OrdersBusinessServiceInterface service;
//	
//	@Autowired
//    private LoginService loginService;

	@GetMapping("/login")
	public String display(Model model) {
		model.addAttribute("title", "Login Form");
//		model.addAttribute("loginModel", new LoginModel());
		// view resolver takes the view name returned by the controller ("home") and maps it to a specific view file (home.html)
		// returning "home" from the controller method would result in the view resolver looking for a file named home.html in the templates directory.
		return "login"; // View name
	}
	
//	@PostMapping("/doLogin")
//	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
//		//System.out.println(String.format("Form with Username of %s and Password of %s", loginModel.getUsername(), loginModel.getPassword()));
//		
//		// Check for validation errors:
//		if (bindingResult.hasErrors()) {
//			model.addAttribute("title", "Login Form");
//			// Open login.html
//			return "login";
//		}
//		
//		// Authenticate user
//		if(loginService.authenticate(loginModel.getUsername(), loginModel.getPassword())) {
//			
//			// Create some orders
//			// Return Orders from the OrdersBusinessService class (Activity 1, step 15)
//			List<OrderModel> orders = service.getOrders();
//			
//			// Set Model Attributes
//			model.addAttribute("title2", "My Orders");
//			model.addAttribute("orders", orders);
//			
//			// Open orders.html
//			return "orders"; 
//		}
//		
//		// If user is not in the database, display login page
//		else {
//			model.addAttribute("errorMessage", "Invalid username or password.");
//			return "login";
//		}
//	}
}
