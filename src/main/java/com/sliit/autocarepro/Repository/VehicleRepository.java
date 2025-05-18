package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.Vehicle;
import org.springframework.stereotype.Repository;
import java.util.LinkedList;
import java.util.List;

@Repository
public class VehicleRepository {
    private LinkedList<Vehicle> Vehicles = new LinkedList<>();
    private static int nextId = 0;

    public String save(Vehicle vehicle) {
        if (vehicle.getVehicleId() == 1) {
            vehicle.setVehicleId(nextId++);
        }
        Vehicles.add(vehicle);
        return "Registration Successful";
    }

    public List<Vehicle> findAll() {
        return new LinkedList<>(Vehicles);
    }

    public Vehicle findById(int vehicleId) {
        return Vehicles.stream().filter(c -> c.getVehicleId() == vehicleId).findFirst().orElse(null);
    }


    public void update(Vehicle vehicle) {
        Vehicle existing = findById(vehicle.getVehicleId());
        if (existing != null) {
            existing.setMake(vehicle.getMake());
            existing.setModel(vehicle.getModel());
            existing.setYear(vehicle.getYear());
            existing.setColor(vehicle.getColor());
            existing.setPlateNumber(vehicle.getPlateNumber());
            existing.setVIN(vehicle.getVIN());
        }
    }

    public void delete(int vehicleId) {
        Vehicles.removeIf(c -> c.getVehicleId() == vehicleId);
    }
}
