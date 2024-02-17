package com.example.vehiclerentalplatform.company.service;

import com.example.vehiclerentalplatform.company.model.Company;
import com.example.vehiclerentalplatform.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing Company entities.
 */
@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    /**
     * Constructs a new CompanyService with the specified CompanyRepository.
     *
     * @param companyRepository The CompanyRepository to use for database operations.
     */
    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    /**
     * Retrieves all companies from the database.
     *
     * @return A list of all companies.
     */
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    /**
     * Retrieves a company by its ID from the database.
     *
     * @param id The ID of the company to retrieve.
     * @return An Optional containing the company if found, or empty if not found.
     */
    public Optional<Company> getCompanyById(Long id) {
        return companyRepository.findById(id);
    }

    /**
     * Saves a company to the database.
     *
     * @param company The company to save.
     * @return The saved company.
     */
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    /**
     * Deletes a company from the database by its ID.
     *
     * @param id The ID of the company to delete.
     */
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
