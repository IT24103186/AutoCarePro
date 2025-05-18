package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.MaintenanceSchedule;
import com.sliit.autocarepro.Model.MaintenanceSchedule;
import com.sliit.autocarepro.Repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public String registerSchedule(MaintenanceSchedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public List<MaintenanceSchedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    public boolean updateSchedule(int id , MaintenanceSchedule schedule ) {
       return scheduleRepository.update(id,schedule);
    }

    public boolean deleteSchedule(int id) {
        return  scheduleRepository.delete(id);
    }
}
