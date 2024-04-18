package sjdm.gcu.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import sjdm.gcu.data.entity.MensEntity;

public interface MensRepository extends MongoRepository<MensEntity, String>{
	MensEntity getOrderById(String id);
}
