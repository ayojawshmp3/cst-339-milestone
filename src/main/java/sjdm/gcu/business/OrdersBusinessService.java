package sjdm.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sjdm.gcu.data.MensDataService;
import sjdm.gcu.data.OrdersDataService;
import sjdm.gcu.data.WomensDataService;
import sjdm.gcu.data.entity.OrderEntity;
import sjdm.gcu.data.entity.WomensEntity;
import sjdm.gcu.model.OrderModel;
import sjdm.gcu.data.entity.MensEntity;

public class OrdersBusinessService implements OrdersBusinessServiceInterface{

	@Autowired
	private OrdersDataService service;
	
	@Autowired
	private MensDataService mensService;
	
	@Autowired
	private WomensDataService womensService;
	
	@Override
	public void test() {
		System.out.println("Hello from the OrdersBusinessService.");
	}

	@Override
	public List<OrderModel> getOrders() {
		// Get all the Entity Orders
		
		List<OrderEntity> ordersEntity = service.findAll();
		
		// Iterate over the Entity Orders and create a list of Domain Orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity) {
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
		
		// Return list of Domain Orders
		return ordersDomain;
	}
	
	@Override
	public List<OrderModel> getMensOrders(){
		// Get all the Entity Orders
		
		List<MensEntity> mensEntity = mensService.findAll(); 
		
		// Iterate over the Entity Orders and create a list of Domain Orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(MensEntity entity : mensEntity) {
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
		
		// Return list of Domain Orders
		return ordersDomain;
	}
	
	@Override
	public List<OrderModel> getWomensOrders(){
		// Get all the Entity Orders
		
		List<WomensEntity> womensEntity = womensService.findAll(); 
		
		// Iterate over the Entity Orders and create a list of Domain Orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(WomensEntity entity : womensEntity) {
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
		
		// Return list of Domain Orders
		return ordersDomain;
	}
	
	@Override
	public OrderModel getOrderById(String id) {
		// Get the Entity Order
		OrderEntity orderEntity = service.findById(id);
		
		// Convert Entity Order to Domain Order
		return new OrderModel(orderEntity.getId(), orderEntity.getOrderNo(), orderEntity.getProductName(), orderEntity.getPrice(), orderEntity.getQuantity());
	}
	
	@Override
	public void init() {
		System.out.println("This is a test message from the init() method from OrdersBusinessService class.");
	}

	@Override
	public void destroy() {
		System.out.println("This is a test message from the destroy() method from OrdersBusinessService class.");
	}
}
