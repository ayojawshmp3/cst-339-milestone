package sjdm.gcu.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import sjdm.gcu.data.entity.WomensEntity;

public interface WomensRepository extends MongoRepository<WomensEntity, String>{
	WomensEntity getOrderById(String id);
}
