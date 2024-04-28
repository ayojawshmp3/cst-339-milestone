package sjdm.gcu.data;

import java.util.List;

/**
 * Interface for data access operations.
 *
 * @param <T> the type of data
 */
public interface DataAccessInterface<T> {

    /**
     * Retrieves all data.
     *
     * @return a list of all data
     */
    public List<T> findAll();

    /**
     * Retrieves data by ID.
     *
     * @param id the ID to search for
     * @return the data with the specified ID
     */
    public T findById(String id);

    /**
     * Creates new data.
     *
     * @param t the data to create
     * @return true if creation is successful, false otherwise
     */
    public boolean create(T t);

    /**
     * Updates existing data.
     *
     * @param t the data to update
     * @return true if update is successful, false otherwise
     */
    public boolean update(T t);

    /**
     * Deletes existing data.
     *
     * @param t the data to delete
     * @return true if deletion is successful, false otherwise
     */
    public boolean delete(T t);
}
