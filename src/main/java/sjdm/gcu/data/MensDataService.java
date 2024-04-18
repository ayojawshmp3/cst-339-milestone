package sjdm.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sjdm.gcu.data.entity.MensEntity;
import sjdm.gcu.data.repository.MensRepository;

@Service
public class MensDataService implements DataAccessInterface<MensEntity>{
	@Autowired
	private MensRepository mensRepository;
	
	public MensDataService(MensRepository mensRepository) {
		this.mensRepository = mensRepository;
	}
	
	@Override
	public MensEntity findById(String id) {
		return mensRepository.getOrderById(id);
	}
	
	public List<MensEntity> findAll() {
		List<MensEntity> orders = new ArrayList<MensEntity>();
		
		try {
			Iterable<MensEntity> ordersIterable = mensRepository.findAll();
			
			// Convert to a list and return the list
			orders = new ArrayList<MensEntity>();
			ordersIterable.forEach(orders::add);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}

	public boolean create(MensEntity order) {
		try {
			this.mensRepository.save(order);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean update(MensEntity t) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean delete(MensEntity t) {
		// TODO Auto-generated method stub
		return true;
	}
}
