package com.sliit.autocarepro.Controller;

import com.sliit.autocarepro.Model.MaintenanceSchedule;
import com.sliit.autocarepro.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping
    public String registerSchedule(@RequestBody MaintenanceSchedule schedule) {
        return  scheduleService.registerSchedule(schedule);
    }

    @GetMapping
    public List<MaintenanceSchedule> getAllSchedules() {
        return scheduleService.getAllSchedules();
    }

    @PutMapping("/{id}")
    public boolean updateSchedule(@PathVariable("id") int id , @RequestBody MaintenanceSchedule schedule) {
       return scheduleService.updateSchedule(id, schedule);
    }

    @DeleteMapping("/{id}")
    public boolean deleteSchedule(@PathVariable("id") int id) {
        return  scheduleService.deleteSchedule(id);
    }
}
