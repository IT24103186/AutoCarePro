package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.Garage;

import java.util.List;

public interface GarageService {
    public String registerGarage(Garage garage);
    public List<Garage> getAllGarages();
    public boolean updateGarage(int garageid , Garage garage);
    public boolean deleteGarage(int garageid);
}
