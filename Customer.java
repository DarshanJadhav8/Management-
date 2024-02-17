package com.example.vehiclerentalplatform.customer.model;

/**
 * Represents a customer entity in the vehicle rental platform.
 */
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    /**
     * Default constructor for the Customer class.
     */
    public Customer() {
        // Default constructor
    }

    /**
     * Constructs a new Customer object with the specified attributes.
     *
     * @param id          The ID of the customer.
     * @param firstName   The first name of the customer.
     * @param lastName    The last name of the customer.
     * @param email       The email address of the customer.
     * @param phoneNumber The phone number of the customer.
     */
    public Customer(Long id, String firstName, String lastName, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves the ID of the customer.
     *
     * @return The ID of the customer.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the customer.
     *
     * @param id The ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the first name of the customer.
     *
     * @return The first name of the customer.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer.
     *
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the last name of the customer.
     *
     * @return The last name of the customer.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer.
     *
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieves the email address of the customer.
     *
     * @return The email address of the customer.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the customer.
     *
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the phone number of the customer.
     *
     * @return The phone number of the customer.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the customer.
     *
     * @param phoneNumber The phone number to set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
