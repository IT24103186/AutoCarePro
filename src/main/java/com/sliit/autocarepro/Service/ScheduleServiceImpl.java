package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.MaintenanceSchedule;
import com.sliit.autocarepro.Repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public String registerSchedule(MaintenanceSchedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public List<MaintenanceSchedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public boolean updateSchedule(int id , MaintenanceSchedule schedule ) {
        return scheduleRepository.update(id,schedule);
    }

    @Override
    public boolean deleteSchedule(int id) {
        return  scheduleRepository.delete(id);
    }
}
