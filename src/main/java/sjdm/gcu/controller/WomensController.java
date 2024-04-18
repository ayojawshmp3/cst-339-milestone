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
@RequestMapping("/home")
public class WomensController {
	
	@Autowired
    private OrdersBusinessServiceInterface service;
	
	@GetMapping("/womens")
	public String getWomensProducts(Model model) {
		List<OrderModel> orders = service.getWomensOrders();
		
		// Set Model Attributes
		model.addAttribute("title2", "My Orders");
		model.addAttribute("orders", orders);
		
		return "womens";
	}

}
