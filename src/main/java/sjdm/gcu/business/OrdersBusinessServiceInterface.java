package sjdm.gcu.business;

import java.util.List;
import sjdm.gcu.OrderModel;

public interface OrdersBusinessServiceInterface {

	public void test();
	public List<OrderModel> getOrders();
	public void init();
	public void destroy();
}
