package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.ServiceType;
import com.sliit.autocarepro.Repository.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService {

    private final ServiceTypeRepository serviceTypeRepository;

    @Autowired
    public ServiceTypeService(ServiceTypeRepository serviceTypeRepository) {
        this.serviceTypeRepository = serviceTypeRepository;
    }


    public String registerServiceType(ServiceType serviceType) {
        return serviceTypeRepository.save(serviceType);
    }

    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeRepository.findAll();
    }

    public boolean updateServiceType(int id , ServiceType serviceType) {
       return  serviceTypeRepository.update(id , serviceType);
    }

    public boolean deleteServiceType(int id) {
        return serviceTypeRepository.delete(id);
    }
}