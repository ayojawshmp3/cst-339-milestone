package sjdm.gcu.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Model class representing user registration information.
 */
public class RegisterModel {

    /**
     * First name of the user.
     */
    @NotNull(message="First name is a required field.")
    @Size(min=1, max=32, message="Must be between 1 and 32 characters.")
    private String firstName;

    /**
     * Last name of the user.
     */
    @NotNull(message="Last name is a required field.")
    @Size(min=1, max=32, message="Must be between 1 and 32 characters.")
    private String lastName;

    /**
     * Email address of the user.
     */
    @NotNull(message="Email is a required field.")
    @Size(min=1, max=64, message="Must be between 1 and 64 characters.")
    private String email;

    /**
     * Phone number of the user.
     */
    @NotNull(message="Phone number is a required field.")
    @Size(min=1, max=32, message="Must be between 1 and 32 characters.")
    private String phoneNumber;

    /**
     * Username chosen by the user.
     */
    @NotNull(message="User name is a required field.")
    @Size(min=1, max=32, message="Must be between 1 and 32 characters.")
    private String username;

    /**
     * Password chosen by the user.
     */
    @NotNull(message="Password is a required field.")
    @Size(min=1, max=32, message="Must be between 1 and 32 characters.")
    private String password;

    /**
     * Retrieves the first name of the user.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the last name of the user.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieves the email address of the user.
     *
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     *
     * @param email the email address to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the phone number of the user.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the user.
     *
     * @param phoneNumber the phone number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves the username chosen by the user.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username chosen by the user.
     *
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retrieves the password chosen by the user.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password chosen by the user.
     *
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
