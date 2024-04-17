package sjdm.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sjdm.gcu.business.OrdersBusinessService;
import sjdm.gcu.business.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
	
	@Bean(name="ordersBusinessService")
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService();
	}

}
