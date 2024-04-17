package sjdm.gcu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import sjdm.gcu.business.OrdersBusinessServiceInterface;

@Controller
@RequestMapping("/home")
public class ProductController {
	@Autowired
    private OrdersBusinessServiceInterface service;
	
	@GetMapping("/product")
	public String display(Model model) {
		model.addAttribute("title", "Create product Form");
		model.addAttribute("productModel", new ProductModel());
		// Open createproduct.html
		return "createproduct"; // View Name
	}
	
	@PostMapping("/newProduct")
	public String newProduct(@Valid ProductModel productModel, BindingResult bindingResult, Model model) {
	
		// Check for validation errors:
		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Create product Form");
			return "createproduct"; // View Name
		}
		
		List<OrderModel> orders = service.getOrders();
		
		// Set Model Attributes
		model.addAttribute("title2", "My Orders");
		model.addAttribute("orders", orders);
		
		// Open orders.html
		return "orders"; 
	}
}
