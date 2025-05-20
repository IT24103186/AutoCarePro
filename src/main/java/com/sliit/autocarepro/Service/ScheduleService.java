package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.MaintenanceSchedule;

import java.util.List;

public interface ScheduleService {
    public String registerSchedule(MaintenanceSchedule schedule);
    public List<MaintenanceSchedule> getAllSchedules();
    public boolean updateSchedule(int id , MaintenanceSchedule schedule );
    public boolean deleteSchedule(int id);
}
