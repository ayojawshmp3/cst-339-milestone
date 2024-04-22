package sjdm.gcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sjdm.gcu.business.OrdersBusinessServiceInterface;
import sjdm.gcu.model.OrderModel;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	private OrdersBusinessServiceInterface service;
	
	@GetMapping("/display")
	public String display(Model model) {
		// Create some orders
		// Return Orders from the OrdersBusinessService class (Activity 1, step 15)
		List<OrderModel> orders = service.getOrders();
		
		// Set Model Attributes
		model.addAttribute("title2", "My Orders");
		model.addAttribute("orders", orders);
		
		// Open orders.html
		return "orders"; 
	}
}
