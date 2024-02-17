package com.example.vehiclerentalplatform.company.controller;

import com.example.vehiclerentalplatform.company.model.Company;
import com.example.vehiclerentalplatform.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing Company entities.
 */
@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService companyService;

    /**
     * Constructs a new CompanyController with the specified CompanyService.
     *
     * @param companyService The CompanyService to use for managing companies.
     */
    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    /**
     * Retrieves all companies.
     *
     * @return A list of all companies.
     */
    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    /**
     * Retrieves a company by its ID.
     *
     * @param id The ID of the company to retrieve.
     * @return The company with the specified ID.
     */
    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyById(id).orElse(null); // Handle if company is not found
    }

    /**
     * Saves a new company.
     *
     * @param company The company to save.
     * @return The saved company.
     */
    @PostMapping
    public Company saveCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    /**
     * Deletes a company by its ID.
     *
     * @param id The ID of the company to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }
}
