package sjdm.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sjdm.gcu.data.DataAccessInterface;

import sjdm.gcu.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface{

	@Autowired
	private DataAccessInterface<OrderModel> service;
	
	@Override
	public void test() {
		System.out.println("Hello from the OrdersBusinessService.");
	}

	@Override
	public List<OrderModel> getOrders() {
		return service.findAll();
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
