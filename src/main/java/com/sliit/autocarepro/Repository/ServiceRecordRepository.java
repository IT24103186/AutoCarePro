package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.ServiceRecord;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class ServiceRecordRepository {
    private LinkedList<ServiceRecord> serviceRecords = new LinkedList<>();

    public String save(ServiceRecord serviceRecord) {
        if (serviceRecord.getRecordID() == 0) {
        }
        serviceRecords.add(serviceRecord);
        return "Registration Successful";
    }

    public List<ServiceRecord> findAll() {
        return new LinkedList<>(serviceRecords);
    }

    public ServiceRecord findById(int id) {
        return serviceRecords.stream().filter(c -> c.getRecordID() == id).findFirst().orElse(null);
    }

    public void deleteByRecordId(int recordID) {
        serviceRecords.removeIf(c -> c.getRecordID() == recordID);
    }

    public String update(ServiceRecord serviceRecord, int recordID) {
        ServiceRecord existing = findById(recordID);
        if (existing != null) {
            existing.setDate(serviceRecord.getDate());
            existing.setCustomer(serviceRecord.getCustomer());
            existing.setVehicle(serviceRecord.getVehicle());
            existing.setService(serviceRecord.getService());
        }
        return "Update Successful";

    }
}
