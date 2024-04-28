package sjdm.gcu.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Model class representing login information.
 */
public class LoginModel {

    /**
     * User's username.
     */
    @NotNull(message="User name is a required field.")
    @Size(min=1, max=32, message="User name must be between 1 and 32 characters.")
    private String username;

    /**
     * User's password.
     */
    @NotNull(message="Password is a required field.")
    @Size(min=1, max=32, message="Password must be between 1 and 32 characters.")
    private String password;

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
