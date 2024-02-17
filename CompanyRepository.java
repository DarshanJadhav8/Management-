package com.example.vehiclerentalplatform.company.repository;

import com.example.vehiclerentalplatform.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Company entities.
 * This interface extends JpaRepository, providing CRUD operations for Company entities.
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    /**
     * Example custom query method.
     * You can define additional query methods here based on your requirements.
     * For more complex queries, you can use @Query annotation.
     *
     * @param companyName The name of the company to search for.
     * @return The Company object with the specified company name.
     */
    Company findByCompanyName(String companyName);
}
