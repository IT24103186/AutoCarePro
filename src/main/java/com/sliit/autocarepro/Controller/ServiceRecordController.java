package com.sliit.autocarepro.Controller;

import com.sliit.autocarepro.Model.ServiceRecord;
import com.sliit.autocarepro.Service.SRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/service-record")
public class ServiceRecordController {

    @Autowired
    private SRecordService sRecordService;

    @PostMapping
    public String registerServiceRecord(@RequestBody ServiceRecord serviceRecord) {
        return sRecordService.registerServiceRecord(serviceRecord);
    }

    @GetMapping
    public List<ServiceRecord> getAllServiceRecord() {
        return sRecordService.getAllServiceRecord();
    }

    @PutMapping("/{recordID}")
    public String updateServiceRecord(@PathVariable("recordID")int recordID,@RequestBody ServiceRecord serviceRecord) {

        return sRecordService.updateServiceRecord(serviceRecord,recordID);
    }

    @DeleteMapping(  "/{id}")
    public void deleteServiceRecord(@PathVariable("id") int id) {
        sRecordService.deleteServiceRecord(id);
    }
}
