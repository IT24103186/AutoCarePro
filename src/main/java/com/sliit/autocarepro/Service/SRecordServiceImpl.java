package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.ServiceRecord;
import com.sliit.autocarepro.Repository.ServiceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SRecordServiceImpl implements SRecordService {
    
    private final ServiceRecordRepository serviceRecordRepository;

    public SRecordServiceImpl(ServiceRecordRepository serviceRecordRepository) {
        this.serviceRecordRepository = serviceRecordRepository;
    }

    @Override
    public String registerServiceRecord(ServiceRecord serviceRecord) {
        return serviceRecordRepository.save(serviceRecord);
    }

    @Override
    public List<ServiceRecord> getAllServiceRecord() {
        return serviceRecordRepository.findAll();
    }

    @Override
    public String updateServiceRecord(ServiceRecord serviceRecord, int recordID) {
      return   serviceRecordRepository.update(serviceRecord,recordID);
    }

    @Override
    public void deleteServiceRecord(int recordID) {
        serviceRecordRepository.deleteByRecordId(recordID);
    }
}
