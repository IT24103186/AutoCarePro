package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.ServiceType;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class ServiceTypeRepository {
    private LinkedList<ServiceType> serviceTypes = new LinkedList<>();
    private static int nextId = 1;

    public String save(ServiceType serviceType) {
        if (serviceType.getId() == 0) {
            serviceType.setId(nextId++);
        }
        serviceTypes.add(serviceType);
        return "Service Type Registered Successfully";
    }

    public List<ServiceType> findAll() {
        return new LinkedList<>(serviceTypes);
    }

    public ServiceType findById(int id) {
        return serviceTypes.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public void update(ServiceType serviceType) {
        ServiceType existing = findById(serviceType.getId());
        if (existing != null) {
            existing.setService(serviceType.getService());
            existing.setDescription(serviceType.getDescription());
            existing.setTimeRequired(serviceType.getTimeRequired());
            existing.setPriceRange(serviceType.getPriceRange());
        }
    }

    public void delete(int id) {
        serviceTypes.removeIf(s -> s.getId() == id);
    }
}
