package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.ServiceRecord;

import java.util.List;

public interface SRecordService {

    public String registerServiceRecord(ServiceRecord serviceRecord);
    public List<ServiceRecord> getAllServiceRecord();
    public String updateServiceRecord(ServiceRecord serviceRecord, int recordID);
    public void deleteServiceRecord(int recordID);
}
