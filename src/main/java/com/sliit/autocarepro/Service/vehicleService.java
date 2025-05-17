package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.vehicle;
import com.sliit.autocarepro.Repository.vehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class vehicleService {



    private final vehicleRepository vehicleRepository;

    @Autowired
    public vehicleService(vehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;}


    public String registerVehicle(vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public void updateVehicle(vehicle vehicle) {
        vehicleRepository.update(vehicle);
    }

    public void deleteVehicle(int plateNumber) {
        vehicleRepository.delete(plateNumber);
    }
}
