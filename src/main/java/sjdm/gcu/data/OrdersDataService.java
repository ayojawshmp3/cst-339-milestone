package sjdm.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sjdm.gcu.data.entity.OrderEntity;
import sjdm.gcu.data.repository.OrdersRepository;

@Service
public class OrdersDataService implements DataAccessInterface<OrderEntity>{
	@Autowired
	private OrdersRepository ordersRepository;
	
	public OrdersDataService(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}
	
	@Override
	public OrderEntity findById(String id) {
		return ordersRepository.getOrderById(id);
	}
	
	public List<OrderEntity> findAll() {
		List<OrderEntity> orders = new ArrayList<OrderEntity>();
		
		try {
			Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();
			
			// Convert to a list and return the list
			orders = new ArrayList<OrderEntity>();
			ordersIterable.forEach(orders::add);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}

	public boolean create(OrderEntity order) {
		try {
			this.ordersRepository.save(order);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean update(OrderEntity t) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean delete(OrderEntity t) {
		// TODO Auto-generated method stub
		return true;
	}
}
