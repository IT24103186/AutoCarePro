package com.sliit.autocarepro.Controller;

import com.sliit.autocarepro.Model.vehicle;
import com.sliit.autocarepro.Service.vehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class vehicleController {

    @Autowired
    private vehicleService vehicleService;

    @PostMapping
    public String registerVehicle(@RequestBody vehicle vehicle) {
        return vehicleService.registerVehicle(vehicle);
    }

    @GetMapping
    public List<vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @PutMapping
    public vehicle updateVehicle(@RequestBody vehicle vehicle) {
        vehicleService.updateVehicle(vehicle);
        return vehicle;
    }

    @DeleteMapping(params = "vehicleId")
    public void deleteVehicle(@RequestParam int vehicleId) {
        vehicleService.deleteVehicle(vehicleId);
    }
}
