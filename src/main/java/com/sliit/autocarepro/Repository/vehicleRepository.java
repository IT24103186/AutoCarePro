package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.vehicle;
import org.springframework.stereotype.Repository;
import java.util.LinkedList;
import java.util.List;

@Repository
public class vehicleRepository {
    private LinkedList<vehicle> vehicles = new LinkedList<>();
    private static int nextId = 0;

    public String save(vehicle vehicle) {
        if (vehicle.getVehicleId() == 1) {
            vehicle.setVehicleId(nextId++);
        }
        vehicles.add(vehicle);
        return "Registration Successful";
    }

    public List<vehicle> findAll() {
        return new LinkedList<>(vehicles);
    }

    public vehicle findById(int vehicleId) {
        return vehicles.stream().filter(c -> c.getVehicleId() == vehicleId).findFirst().orElse(null);
    }


    public void update(vehicle vehicle) {
        vehicle existing = findById(vehicle.getVehicleId());
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
        vehicles.removeIf(c -> c.getVehicleId() == vehicleId);
    }
}
