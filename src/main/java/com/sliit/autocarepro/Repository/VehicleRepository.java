package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.ServiceRecord;
import com.sliit.autocarepro.Model.Vehicle;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Repository
public class VehicleRepository {
    private LinkedList<Vehicle> Vehicles = new LinkedList<>();
    private static int nextId = 1;

    public String save(Vehicle vehicle) {
        if (vehicle.getVehicleId() == 0) {
            vehicle.setVehicleId(nextId++);
        }
        Vehicles.add(vehicle);
        saveToTextFile();
        return "Registration Successful";

    }

    public List<Vehicle> findAll() {
        return new LinkedList<>(Vehicles);
    }

    public Vehicle findById(int vehicleId) {
        return Vehicles.stream().filter(c -> c.getVehicleId() == vehicleId).findFirst().orElse(null);
    }


    public void update(Vehicle vehicle, int vehicleId ) {
        Vehicle existing = findById(vehicleId);
        if (existing != null) {
            existing.setMake(vehicle.getMake());
            existing.setModel(vehicle.getModel());
            existing.setYear(vehicle.getYear());
            existing.setColor(vehicle.getColor());
            existing.setPlateNumber(vehicle.getPlateNumber());
            existing.setVIN(vehicle.getVIN());
        }
        saveToTextFile();
    }

    public void delete(int vehicleId) {
        Vehicles.removeIf(c -> c.getVehicleId() == vehicleId);
        saveToTextFile();
    }

    private String saveToTextFile() {
        String folderPath = "src/main/java/com/sliit/autocarepro/Log";
        String filePath = folderPath + File.separator + "vehicleSaveLog.txt";

        // Create the Log folder if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            boolean folderCreated = folder.mkdirs();
            if (!folderCreated) {
                return "Error creating Log folder at " + folderPath;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Vehicle record : Vehicles) {
                writer.write(String.format("vehicleID: %d, make: %s, model: %s, color: %s, year: %s, plateNumber: %s, vin: %s",
                        record.getVehicleId(),
                        record.getMake(),
                        record.getModel(),
                        record.getColor(),
                        record.getYear(),
                        record.getPlateNumber(),
                        record.getVIN()));
            }
            return "Data successfully saved to " + filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error saving data to file: " + e.getMessage();
        }
    }
}
