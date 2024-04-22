package sjdm.gcu.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import sjdm.gcu.data.entity.UserEntity;

public interface UsersRepository extends MongoRepository<UserEntity, String> {
	UserEntity findByUsername(String username);
}