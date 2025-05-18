package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.Garage;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class GarageRepository {

    private LinkedList<Garage> garages = new LinkedList<>();
    private static int nextId = 1;

    public void save(Garage garage) {
        if (garage.getId() == null || garage.getId().isEmpty()) {
            garage.setId(String.valueOf(nextId++));
        }
        garages.add(garage);
    }

    public List<Garage> findAll() {
        return new LinkedList<>(garages);
    }

    public Garage findById(String id) {
        return garages.stream()
                .filter(g -> g.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void update(Garage garage) {
        Garage existing = findById(garage.getId());
        if (existing != null) {
            existing.setBranch(garage.getBranch());
            existing.setLocation(garage.getLocation());
            existing.setManager(garage.getManager());
        }
    }

    public void delete(String id) {
        garages.removeIf(g -> g.getId().equals(id));
    }
}

