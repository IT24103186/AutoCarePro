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

    @PutMapping("/{id}")
    public boolean updateServiceType(@PathVariable("id") int id , @RequestBody ServiceType serviceType) {
        return  serviceTypeService.updateServiceType(id , serviceType);
    }

    @DeleteMapping("/{id}")
    public boolean deleteServiceType(@PathVariable("id") int id) {
        return serviceTypeService.deleteServiceType(id);
    }
}
