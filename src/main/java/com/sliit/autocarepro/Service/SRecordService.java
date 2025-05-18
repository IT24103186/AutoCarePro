package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.ServiceRecord;
import com.sliit.autocarepro.Repository.ServiceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SRecordService {

    private final ServiceRecordRepository serviceRecordRepository;

    @Autowired
    public SRecordService(ServiceRecordRepository serviceRecordRepository) {
        this.serviceRecordRepository = serviceRecordRepository;}
        public String registerServiceRecord(ServiceRecord serviceRecord) {
        return serviceRecordRepository.save(serviceRecord);
    }

    public List<ServiceRecord> getAllServiceRecord() {
        return serviceRecordRepository.findAll();
    }

    public String updateServiceRecord(ServiceRecord serviceRecord, int recordID) {
      return   serviceRecordRepository.update(serviceRecord,recordID);
    }

    public void deleteServiceRecord(int recordID) {
        serviceRecordRepository.deleteByRecordId(recordID);
    }
}
