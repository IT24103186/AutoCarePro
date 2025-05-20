package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.MaintenanceSchedule;
import com.sliit.autocarepro.Model.Vehicle;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ScheduleRepository {
    private final LinkedList<MaintenanceSchedule> schedules = new LinkedList<>();
    private static int nextId = 0;

    public String save(MaintenanceSchedule schedule) {
        if (schedule.getScheduleId() == 0) {
            schedule.setScheduleId(nextId++);
        }
        schedules.add(schedule);
        saveToTextFile();
        return "Save Successful";
    }

    public List<MaintenanceSchedule> findAll() {
        return new LinkedList<>(schedules);
    }

    public MaintenanceSchedule findById(int id) {
        return schedules.stream()
                .filter(s -> s.getScheduleId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean update(int id , MaintenanceSchedule schedule) {
        if (schedule == null || schedule.getScheduleId() <= 0) {
            saveToTextFile();
            return false;
        }

        MaintenanceSchedule existing = findById(id);
        if (existing == null) {
            saveToTextFile();
            return false;
        }
        existing.setDate(schedule.getDate());
        existing.setTime(schedule.getTime());
        existing.setPlateNumber(schedule.getPlateNumber());
        existing.setServiceType(schedule.getServiceType());
        existing.setStatus(schedule.getStatus());

        saveToTextFile();
        return true;
    }

    public boolean  delete(int id) {
        schedules.removeIf(s -> s.getScheduleId() == id);
        saveToTextFile();
        return  true;
    }

    private String saveToTextFile() {
        String folderPath = "src/main/java/com/sliit/autocarepro/Log";
        String filePath = folderPath + File.separator + "ScheduleSaveLog.txt";

        // Create the Log folder if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            boolean folderCreated = folder.mkdirs();
            if (!folderCreated) {
                return "Error creating Log folder at " + folderPath;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (MaintenanceSchedule record : schedules) {
                writer.write(String.format("scheduleId: %d, date: %s, time: %s, plateNumber: %s, serviceType: %s, status: %s%n",
                        record.getScheduleId(),
                        record.getDate(),
                        record.getTime(),
                        record.getPlateNumber(),
                        record.getServiceType(),
                        record.getStatus()));
            }
            return "Data successfully saved to " + filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error saving data to file: " + e.getMessage();
        }
    }
}
