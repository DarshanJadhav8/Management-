package com.example.vehiclerentalplatform.vehicleowner.service;

import com.example.vehiclerentalplatform.vehicleowner.model.VehicleOwner;
import com.example.vehiclerentalplatform.vehicleowner.repository.VehicleOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing VehicleOwner entities.
 */
@Service
public class VehicleOwnerService {

    private final VehicleOwnerRepository vehicleOwnerRepository;

    /**
     * Constructs a new VehicleOwnerService with the specified VehicleOwnerRepository.
     *
     * @param vehicleOwnerRepository The VehicleOwnerRepository to use for database operations.
     */
    @Autowired
    public VehicleOwnerService(VehicleOwnerRepository vehicleOwnerRepository) {
        this.vehicleOwnerRepository = vehicleOwnerRepository;
    }

    /**
     * Retrieves all vehicle owners from the database.
     *
     * @return A list of all vehicle owners.
     */
    public List<VehicleOwner> getAllVehicleOwners() {
        return vehicleOwnerRepository.findAll();
    }

    /**
     * Retrieves a vehicle owner by its ID from the database.
     *
     * @param id The ID of the vehicle owner to retrieve.
     * @return An Optional containing the vehicle owner if found, or empty if not found.
     */
    public Optional<VehicleOwner> getVehicleOwnerById(Long id) {
        return vehicleOwnerRepository.findById(id);
    }

    /**
     * Saves a vehicle owner to the database.
     *
     * @param vehicleOwner The vehicle owner to save.
     * @return The saved vehicle owner.
     */
    public VehicleOwner saveVehicleOwner(VehicleOwner vehicleOwner) {
        return vehicleOwnerRepository.save(vehicleOwner);
    }

    /**
     * Deletes a vehicle owner from the database by its ID.
     *
     * @param id The ID of the vehicle owner to delete.
     */
    public void deleteVehicleOwner(Long id) {
        vehicleOwnerRepository.deleteById(id);
    }
}
