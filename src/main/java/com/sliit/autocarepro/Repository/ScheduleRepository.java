package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.MaintenanceSchedule;
import org.springframework.stereotype.Repository;

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
            return false;
        }

        MaintenanceSchedule existing = findById(id);
        if (existing == null) {
            return false;
        }

        existing.setDate(schedule.getDate());
        existing.setTime(schedule.getTime());
        existing.setPlateNumber(schedule.getPlateNumber());
        existing.setServiceType(schedule.getServiceType());
        existing.setStatus(schedule.getStatus());
        existing.setNotes(schedule.getNotes());

        return true;
    }

    public boolean  delete(int id) {
        schedules.removeIf(s -> s.getScheduleId() == id);
        return  true;
    }
}
