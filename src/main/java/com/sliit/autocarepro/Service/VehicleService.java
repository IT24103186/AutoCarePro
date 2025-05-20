package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.Vehicle;

import java.util.List;

public interface VehicleService {

    public String registerVehicle(Vehicle vehicle);
    public List<Vehicle> getAllVehicles();
    public String updateVehicle(Vehicle serviceRecord, int vehicleId);
    public void deleteVehicle(int vehicleId);
}
