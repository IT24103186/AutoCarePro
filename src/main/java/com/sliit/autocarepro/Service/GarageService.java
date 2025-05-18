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

    public String registerGarage(Garage garage) {
      return   garageRepository.save(garage);
    }

    public List<Garage> getAllGarages() {
        return garageRepository.findAll();
    }

    public boolean updateGarage(int id , Garage garage) {
      return garageRepository.update(id , garage);
    }

    public boolean deleteGarage(int id) {
      return garageRepository.delete(id);
    }
}

