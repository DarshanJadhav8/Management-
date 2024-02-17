package com.example.vehiclerentalplatform.vehicleowner.repository;

import com.example.vehiclerentalplatform.vehicleowner.model.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing VehicleOwner entities.
 * This interface extends JpaRepository, providing CRUD operations for VehicleOwner entities.
 */
@Repository
public interface VehicleOwnerRepository extends JpaRepository<VehicleOwner, Long> {


}
