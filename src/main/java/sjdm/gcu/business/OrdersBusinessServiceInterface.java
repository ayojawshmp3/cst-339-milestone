package sjdm.gcu.business;

import java.util.List;

import sjdm.gcu.model.OrderModel;

public interface OrdersBusinessServiceInterface {

	public void test();
	public List<OrderModel> getOrders();
	public List<OrderModel> getMensOrders();
	public List<OrderModel> getWomensOrders();
	public OrderModel getOrderById(String id);
	public void init();
	public void destroy();
}
