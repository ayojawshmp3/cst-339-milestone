package sjdm.gcu.data;

/**
 * Interface for accessing user data.
 *
 * @param <T> the type of user data
 */
public interface UsersDataAccessInterface<T> {

    /**
     * Finds user by username.
     *
     * @param username the username to search for
     * @return the user with the specified username
     */
    public T findByUsername(String username);
}