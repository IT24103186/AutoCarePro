package com.sliit.autocarepro.Controller;

import com.sliit.autocarepro.Model.ServiceType;
import com.sliit.autocarepro.Service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service-types")
public class ServiceTypeController {

    @Autowired
    private ServiceTypeService serviceTypeService;

    @PostMapping
    public String registerServiceType(@RequestBody ServiceType serviceType) {
        return serviceTypeService.registerServiceType(serviceType);
    }

    @GetMapping
    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeService.getAllServiceTypes();
    }

    @PutMapping
    public ServiceType updateServiceType(@RequestBody ServiceType serviceType) {
        serviceTypeService.updateServiceType(serviceType);
        return serviceType;
    }

    @DeleteMapping(params = "id")
    public void deleteServiceType(@RequestParam int id) {
        serviceTypeService.deleteServiceType(id);
    }
}
