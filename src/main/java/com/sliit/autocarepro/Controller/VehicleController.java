package com.sliit.autocarepro.Controller;

import com.sliit.autocarepro.Model.Vehicle;
import com.sliit.autocarepro.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public String registerVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.registerVehicle(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @PutMapping
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.updateVehicle(vehicle);
        return vehicle;
    }

    @DeleteMapping(params = "vehicleId")
    public void deleteVehicle(@RequestParam int vehicleId) {
        vehicleService.deleteVehicle(vehicleId);
    }
}
