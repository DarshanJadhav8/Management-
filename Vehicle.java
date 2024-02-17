package com.example.vehiclerentalplatform.vehicle.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a vehicle entity in the vehicle rental platform.
 */
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make; // Make of the vehicle (e.g., Toyota, Honda)
    private String model; // Model of the vehicle (e.g., Camry, Civic)
    private int year; // Year of manufacture of the vehicle

    /**
     * Default constructor for the Vehicle class.
     */
    public Vehicle() {
        // Default constructor
    }

    /**
     * Constructs a new Vehicle object with the specified attributes.
     *
     * @param make  The make of the vehicle.
     * @param model The model of the vehicle.
     * @param year  The year of manufacture of the vehicle.
     */
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * Retrieves the ID of the vehicle.
     *
     * @return The ID of the vehicle.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the vehicle.
     *
     * @param id The ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the make of the vehicle.
     *
     * @return The make of the vehicle.
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the make of the vehicle.
     *
     * @param make The make to set.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Retrieves the model of the vehicle.
     *
     * @return The model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the vehicle.
     *
     * @param model The model to set.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Retrieves the year of manufacture of the vehicle.
     *
     * @return The year of manufacture of the vehicle.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of manufacture of the vehicle.
     *
     * @param year The year to set.
     */
    public void setYear(int year) {
        this.year = year;
    }

    // You can add additional methods and attributes as needed
}
