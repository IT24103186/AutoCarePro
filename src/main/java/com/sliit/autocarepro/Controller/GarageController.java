package com.sliit.autocarepro.Controller;

import com.sliit.autocarepro.Model.Garage;
import com.sliit.autocarepro.Service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/garages")
public class GarageController {

    @Autowired
    private GarageService garageService;

    @PostMapping
    public String registerGarage(@RequestBody Garage garage) {
        return garageService.registerGarage(garage);
    }

    @GetMapping
    public List<Garage> getAllGarages() {
        return garageService.getAllGarages();
    }

    @PutMapping("/{id}")
    public boolean updateGarage(@PathVariable("id") int id ,@RequestBody Garage garage) {
       return garageService.updateGarage(id, garage);
    }

    @DeleteMapping( "/{id}")
    public void deleteGarage(@PathVariable("id") int id) {
        garageService.deleteGarage(id);
    }
}

