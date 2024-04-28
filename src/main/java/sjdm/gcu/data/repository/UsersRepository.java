package sjdm.gcu.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import sjdm.gcu.data.entity.UserEntity;

/**
 * Repository interface for user data.
 */
public interface UsersRepository extends MongoRepository<UserEntity, String> {

    /**
     * Finds user by username.
     *
     * @param username the username to search for
     * @return the user with the specified username
     */
    UserEntity findByUsername(String username);
}
