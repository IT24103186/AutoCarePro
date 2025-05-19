package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.Garage;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class GarageRepository {

    private LinkedList<Garage> garages = new LinkedList<>();
    private static int nextId = 1;

    public String save(Garage garage) {
        if (garage.getId() == 0) {
            garage.setId(nextId++);
        }
        garages.add(garage);
        return "Registration Successful";
    }

    public List<Garage> findAll() {
        return new LinkedList<>(garages);
    }

    public Garage findById(int garageid) {
        return garages.stream().filter(c -> c.getId() == garageid).findFirst().orElse(null);
    }

    public boolean update(int garageid , Garage garage) {
        Garage existing = findById(garageid);
        if (existing != null) {
            existing.setBranch(garage.getBranch());
            existing.setLocation(garage.getLocation());
            existing.setManager(garage.getManager());
        }
        return true;
    }

    public boolean delete(int garageid) {
        garages.removeIf(c -> c.getId() == garageid);
        return true;
    }
}

