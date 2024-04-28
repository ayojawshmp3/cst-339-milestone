package sjdm.gcu.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity class representing a user.
 */
@Document(collection="users")
public class UserEntity {

    /**
     * Unique identifier.
     */
    @Id
    String id;

    /**
     * Username.
     */
    @Indexed(unique=true)
    String username;

    /**
     * Password.
     */
    String password;

    /**
     * Default constructor.
     */
    UserEntity() {
        this.id = "";
        this.username = "";
        this.password = "";
    }

    /**
     * Parameterized constructor.
     *
     * @param id the user ID
     * @param username the username
     * @param password the password
     */
    public UserEntity(String id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * Retrieves the user ID.
     *
     * @return the user ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the user ID.
     *
     * @param id the user ID to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retrieves the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
