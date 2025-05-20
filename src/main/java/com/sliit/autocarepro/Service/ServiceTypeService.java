package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    public String registerServiceType(ServiceType serviceType);
    public List<ServiceType> getAllServiceTypes();
    public boolean updateServiceType(int id , ServiceType serviceType);
    public boolean deleteServiceType(int id);
}
