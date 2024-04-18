package sjdm.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sjdm.gcu.data.entity.WomensEntity;
import sjdm.gcu.data.repository.WomensRepository;

@Service
public class WomensDataService implements DataAccessInterface<WomensEntity>{
	@Autowired
	private WomensRepository womensRepository;
	
	public WomensDataService(WomensRepository womensRepository) {
		this.womensRepository = womensRepository;
	}
	
	@Override
	public WomensEntity findById(String id) {
		return womensRepository.getOrderById(id);
	}
	
	public List<WomensEntity> findAll() {
		List<WomensEntity> orders = new ArrayList<WomensEntity>();
		
		try {
			Iterable<WomensEntity> ordersIterable = womensRepository.findAll();
			
			// Convert to a list and return the list
			orders = new ArrayList<WomensEntity>();
			ordersIterable.forEach(orders::add);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}

	public boolean create(WomensEntity order) {
		try {
			this.womensRepository.save(order);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean update(WomensEntity t) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean delete(WomensEntity t) {
		// TODO Auto-generated method stub
		return true;
	}
}
