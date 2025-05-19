package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.Garage;
import com.sliit.autocarepro.Model.Vehicle;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Repository
public class GarageRepository {

    private LinkedList<Garage> garages = new LinkedList<>();
    private static int nextId = 1;

    public String save(Garage garage) {
        if (garage.getId() == 0) {
            garage.setId(nextId++);
        }
        garages.add(garage);
        saveToTextFile();
        return "Registration Successful";
    }

    public List<Garage> findAll() {
        return new LinkedList<>(garages);
    }

    public Garage findById(int garageid) {
        return garages.stream().filter(c -> c.getId() == garageid).findFirst().orElse(null);
    }

    public boolean update(int garageid , Garage garage) {
        Garage existing = findById(garageid);
        if (existing != null) {
            existing.setBranch(garage.getBranch());
            existing.setLocation(garage.getLocation());
            existing.setManager(garage.getManager());
        }
        saveToTextFile();
        return true;
    }

    public boolean delete(int garageid) {
        garages.removeIf(c -> c.getId() == garageid);
        saveToTextFile();
        return true;
    }

    private String saveToTextFile() {
        String folderPath = "src/main/java/com/sliit/autocarepro/Log";
        String filePath = folderPath + File.separator + "GarageSaveLog.txt";

        // Create the Log folder if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            boolean folderCreated = folder.mkdirs();
            if (!folderCreated) {
                return "Error creating Log folder at " + folderPath;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Garage record : garages) {
                writer.write(String.format("garageId: %d, branch: %s, location: %s, managerName: %s ",
                        record.getId(),
                        record.getBranch(),
                        record.getLocation(),
                        record.getManager()));
            }
            return "Data successfully saved to " + filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error saving data to file: " + e.getMessage();
        }
    }
}

