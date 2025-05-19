package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.ServiceRecord;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ServiceRecordRepository {
    private LinkedList<ServiceRecord> serviceRecords = new LinkedList<>();
    private static int nextrecordId = 1;

    public String save(ServiceRecord serviceRecord) {
        if (serviceRecord.getRecordID() == 0) {
            serviceRecord.setRecordID(nextrecordId++);
        }
        serviceRecords.add(serviceRecord);
        String result = saveToTextFile();
        if (result.startsWith("Error")) {
            return "Registration Successful, but failed to update log file: " + result;
        }
        return "Registration Successful";
    }

    public List<ServiceRecord> findAll() {
        return new LinkedList<>(serviceRecords);
    }

    public ServiceRecord findById(int id) {
        return serviceRecords.stream().filter(c -> c.getRecordID() == id).findFirst().orElse(null);
    }

    public void deleteByRecordId(int recordID) {
        serviceRecords.removeIf(c -> c.getRecordID() == recordID);
        saveToTextFile();
    }

    public String update(ServiceRecord serviceRecord, int recordID) {
        ServiceRecord existing = findById(recordID);
        if (existing != null) {
            existing.setDate(serviceRecord.getDate());
            existing.setCustomer(serviceRecord.getCustomer());
            existing.setVehicle(serviceRecord.getVehicle());
            existing.setService(serviceRecord.getService());
            String result = saveToTextFile();
            if (result.startsWith("Error")) {
                return "Update Successful, but failed to update log file: " + result;
            }
        }
        return "Update Successful";
    }

    private String saveToTextFile() {
        String folderPath = "src/main/java/com/sliit/autocarepro/Log";
        String filePath = folderPath + File.separator + "ServiceRecoadSaveLog.txt";

        // Create the Log folder if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            boolean folderCreated = folder.mkdirs();
            if (!folderCreated) {
                return "Error creating Log folder at " + folderPath;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (ServiceRecord record : serviceRecords) {
                writer.write(String.format("RecordID: %d, Date: %s, Customer: %s, Vehicle: %s, Service: %s%n",
                        record.getRecordID(),
                        record.getDate(),
                        record.getCustomer(),
                        record.getVehicle(),
                        record.getService()));
            }
            return "Data successfully saved to " + filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error saving data to file: " + e.getMessage();
        }
    }
}