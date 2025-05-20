package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.Garage;
import com.sliit.autocarepro.Repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarageServiceImpl implements GarageService {

    private final GarageRepository garageRepository;

    @Autowired
    public GarageServiceImpl(GarageRepository garageRepository) {
        this.garageRepository = garageRepository;
    }

    @Override
    public String registerGarage(Garage garage) {
        return garageRepository.save(garage);
    }

    @Override
    public List<Garage> getAllGarages() {
        return garageRepository.findAll();
    }

    @Override
    public boolean updateGarage(int garageid , Garage garage) {
        return  garageRepository.update(garageid ,garage);
    }

    @Override
    public boolean deleteGarage(int garageid) {
        return garageRepository.delete(garageid);
    }
}

