package com.example.vehiclerentalplatform.customer.service;

import com.example.vehiclerentalplatform.customer.model.Customer;
import com.example.vehiclerentalplatform.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing Customer entities.
 */
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    /**
     * Constructs a new CustomerService with the specified CustomerRepository.
     *
     * @param customerRepository The CustomerRepository to use for database operations.
     */
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Retrieves all customers from the database.
     *
     * @return A list of all customers.
     */
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    /**
     * Retrieves a customer by its ID from the database.
     *
     * @param id The ID of the customer to retrieve.
     * @return An Optional containing the customer if found, or empty if not found.
     */
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    /**
     * Saves a customer to the database.
     *
     * @param customer The customer to save.
     * @return The saved customer.
     */
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Deletes a customer from the database by its ID.
     *
     * @param id The ID of the customer to delete.
     */
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
