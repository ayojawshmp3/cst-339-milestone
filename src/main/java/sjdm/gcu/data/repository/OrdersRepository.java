package sjdm.gcu.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import sjdm.gcu.data.entity.OrderEntity;

public interface OrdersRepository extends MongoRepository<OrderEntity, String>{
	OrderEntity getOrderById(String id);
}
