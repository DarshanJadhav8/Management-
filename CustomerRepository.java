package com.example.vehiclerentalplatform.customer.repository;

import com.example.vehiclerentalplatform.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Customer entities.
 * This interface extends JpaRepository, providing CRUD operations for Customer entities.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}
