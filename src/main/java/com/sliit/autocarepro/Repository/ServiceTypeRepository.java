package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.ServiceType;
import com.sliit.autocarepro.Model.Vehicle;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ServiceTypeRepository {
    private LinkedList<ServiceType> serviceTypes = new LinkedList<>();
    private static int nextId = 1;

    public String save(ServiceType serviceType) {
        if (serviceType.getId() == 0) {
            serviceType.setId(nextId++);
        }
        serviceTypes.add(serviceType);
        saveToTextFile();
        return "Service Type Registered Successfully";
    }

    public List<ServiceType> findAll() {
        return new LinkedList<>(serviceTypes);
    }

    public ServiceType findById(long id) {
        return serviceTypes.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public boolean update(int id , ServiceType serviceType) {
        ServiceType existing = findById(id);
        if (existing != null) {
            existing.setService(serviceType.getService());
            existing.setDescription(serviceType.getDescription());
            existing.setTimeRequired(serviceType.getTimeRequired());
            existing.setPriceRange(serviceType.getPriceRange());
        }
        saveToTextFile();
        return true;
    }

    public boolean delete(int id) {
        serviceTypes.removeIf(s -> s.getId() == id);
        saveToTextFile();
        return true;
    }

    private String saveToTextFile() {
        String folderPath = "src/main/java/com/sliit/autocarepro/Log";
        String filePath = folderPath + File.separator + "TypeSaveLog.txt";

        // Create the Log folder if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            boolean folderCreated = folder.mkdirs();
            if (!folderCreated) {
                return "Error creating Log folder at " + folderPath;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (ServiceType record : serviceTypes) {
                writer.write(String.format("id: %d, service: %s, description: %s, timeRequired: %s, priceRange: %s%n",
                        record.getId(),
                        record.getService(),
                        record.getDescription(),
                        record.getTimeRequired(),
                        record.getPriceRange()));
            }
            return "Data successfully saved to " + filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error saving data to file: " + e.getMessage();
        }
    }
}
