package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.ServiceType;
import com.sliit.autocarepro.Repository.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {

    private final ServiceTypeRepository serviceTypeRepository;

    @Autowired
    public ServiceTypeServiceImpl(ServiceTypeRepository serviceTypeRepository) {
        this.serviceTypeRepository = serviceTypeRepository;
    }

    @Override
    public String registerServiceType(ServiceType serviceType) {
        return serviceTypeRepository.save(serviceType);
    }

    @Override
    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public boolean updateServiceType(int id , ServiceType serviceType) {
        return  serviceTypeRepository.update(id , serviceType);
    }

    @Override
    public boolean deleteServiceType(int id) {
        return serviceTypeRepository.delete(id);
    }
}