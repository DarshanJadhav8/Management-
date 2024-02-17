package com.example.vehiclerentalplatform.vehicleowner.controller;

import com.example.vehiclerentalplatform.vehicleowner.model.VehicleOwner;
import com.example.vehiclerentalplatform.vehicleowner.service.VehicleOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing VehicleOwner entities.
 */
@RestController
@RequestMapping("/api/vehicleowners")
public class VehicleOwnerController {

    private final VehicleOwnerService vehicleOwnerService;

    /**
     * Constructs a new VehicleOwnerController with the specified VehicleOwnerService.
     *
     * @param vehicleOwnerService The VehicleOwnerService to use for managing vehicle owners.
     */
    @Autowired
    public VehicleOwnerController(VehicleOwnerService vehicleOwnerService) {
        this.vehicleOwnerService = vehicleOwnerService;
    }

    /**
     * Retrieves all vehicle owners.
     *
     * @return A list of all vehicle owners.
     */
    @GetMapping
    public List<VehicleOwner> getAllVehicleOwners() {
        return vehicleOwnerService.getAllVehicleOwners();
    }

    /**
     * Retrieves a vehicle owner by its ID.
     *
     * @param id The ID of the vehicle owner to retrieve.
     * @return The vehicle owner with the specified ID.
     */
    @GetMapping("/{id}")
    public VehicleOwner getVehicleOwnerById(@PathVariable Long id) {
        return vehicleOwnerService.getVehicleOwnerById(id).orElse(null); // Handle if vehicle owner is not found
    }

    /**
     * Saves a new vehicle owner.
     *
     * @param vehicleOwner The vehicle owner to save.
     * @return The saved vehicle owner.
     */
    @PostMapping
    public VehicleOwner saveVehicleOwner(@RequestBody VehicleOwner vehicleOwner) {
        return vehicleOwnerService.saveVehicleOwner(vehicleOwner);
    }

    /**
     * Deletes a vehicle owner by its ID.
     *
     * @param id The ID of the vehicle owner to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteVehicleOwner(@PathVariable Long id) {
        vehicleOwnerService.deleteVehicleOwner(id);
    }
}
