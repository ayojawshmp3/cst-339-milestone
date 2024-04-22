package sjdm.gcu.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sjdm.gcu.data.entity.UserEntity;
import sjdm.gcu.data.repository.UsersRepository;

@Service
public class UsersDataService implements UsersDataAccessInterface<UserEntity>, DataAccessInterface<UserEntity> {
	@Autowired
	private UsersRepository usersRepository;

	/*
	 * Non-default constructor for injection
	 * */
	public UsersDataService(UsersRepository userRepository) {
		super();
		this.usersRepository = userRepository;
	}
	/**
	 * CRUD: finder to return an entity  by User name
	 * */
	@Override
	public UserEntity findByUsername(String username) {
		return usersRepository.findByUsername(username);
	}

	// From Data Access Interface
	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public UserEntity findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(UserEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(UserEntity t) {
		// TODO Auto-generated method stub
		return false;
	}
}