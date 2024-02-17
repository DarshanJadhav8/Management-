package com.example.vehiclerentalplatform.customer.controller;

import com.example.vehiclerentalplatform.customer.model.Customer;
import com.example.vehiclerentalplatform.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing Customer entities.
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    /**
     * Constructs a new CustomerController with the specified CustomerService.
     *
     * @param customerService The CustomerService to use for managing customers.
     */
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Retrieves all customers.
     *
     * @return A list of all customers.
     */
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    /**
     * Retrieves a customer by its ID.
     *
     * @param id The ID of the customer to retrieve.
     * @return The customer with the specified ID.
     */
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id).orElse(null); // Handle if customer is not found
    }

    /**
     * Saves a new customer.
     *
     * @param customer The customer to save.
     * @return The saved customer.
     */
    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    /**
     * Deletes a customer by its ID.
     *
     * @param id The ID of the customer to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
