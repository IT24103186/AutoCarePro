package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.Vehicle;
import com.sliit.autocarepro.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;}

    public String registerVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public String updateVehicle(Vehicle vehicle,int vehicleId) {
       return vehicleRepository.update(vehicle, vehicleId);
    }

    public void deleteVehicle(int vehiclesId) {
        vehicleRepository.delete(vehiclesId);
    }
}
