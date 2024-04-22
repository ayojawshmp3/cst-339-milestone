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
public class MensController {
	
	@Autowired
    private OrdersBusinessServiceInterface service;
	
	@GetMapping("/mens")
	public String getMensProducts(Model model) {
		List<OrderModel> orders = service.getMensOrders();
		
		// Set Model Attributes
		model.addAttribute("title2", "My Orders");
		model.addAttribute("orders", orders);
		
		return "mens";
	}

}
