package sjdm.gcu.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sjdm.gcu.data.entity.UserEntity;
import sjdm.gcu.data.repository.UsersRepository;

/**
 * Service class for accessing user data.
 */
@Service
public class UsersDataService implements UsersDataAccessInterface<UserEntity>, DataAccessInterface<UserEntity> {

    /**
     * Repository for user data.
     */
    @Autowired
    private UsersRepository usersRepository;

    /**
     * Constructor for dependency injection.
     *
     * @param userRepository UsersRepository instance
     */
    public UsersDataService(UsersRepository userRepository) {
        super();
        this.usersRepository = userRepository;
    }

    /**
     * Finds user by username.
     *
     * @param username the username to search for
     * @return the user with the specified username
     */
    @Override
    public UserEntity findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }

    /**
     * Retrieves all user data.
     *
     * @return a list of all users
     */
    @Override
    public List<UserEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Retrieves user data by ID.
     *
     * @param id the ID to search for
     * @return the user with the specified ID
     */
    @Override
    public UserEntity findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Creates new user data.
     *
     * @param t the user data to create
     * @return true if creation is successful, false otherwise
     */
    @Override
    public boolean create(UserEntity t) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Updates existing user data.
     *
     * @param t the user data to update
     * @return true if update is successful, false otherwise
     */
    @Override
    public boolean update(UserEntity t) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Deletes existing user data.
     *
     * @param t the user data to delete
     * @return true if deletion is successful, false otherwise
     */
    @Override
    public boolean delete(UserEntity t) {
        // TODO Auto-generated method stub
        return false;
    }
}