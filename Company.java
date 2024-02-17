package com.example.vehiclerentalplatform.company.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a company entity in the vehicle rental platform.
 */
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    private String companyName;

    /**
     * Default constructor for the Company class.
     */
    public Company() {
    }

    /**
     * Constructs a new Company object with the specified company name.
     *
     * @param companyName The name of the company.
     */
    public Company(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Retrieves the unique identifier of the company.
     *
     * @return The company ID.
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * Sets the unique identifier of the company.
     *
     * @param companyId The company ID to set.
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * Retrieves the name of the company.
     *
     * @return The company name.
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the name of the company.
     *
     * @param companyName The company name to set.
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
