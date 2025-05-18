package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.Garage;
import com.sliit.autocarepro.Repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarageService {

    private final GarageRepository garageRepository;

    @Autowired
    public GarageService(GarageRepository garageRepository) {
        this.garageRepository = garageRepository;
    }

    public void registerGarage(Garage garage) {
        garageRepository.save(garage);
    }

    public List<Garage> getAllGarages() {
        return garageRepository.findAll();
    }

    public void updateGarage(Garage garage) {
        garageRepository.update(garage);
    }

    public void deleteGarage(String id) {
        garageRepository.delete(id);
    }
}

