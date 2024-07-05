package com.devStaff.farmCollector.controllor;

import com.devStaff.farmCollector.entity.HarvestingData;
import com.devStaff.farmCollector.service.HarvestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HarvestingController {

    @Autowired
    private HarvestingService harvestingService;

    @PostMapping("/harvesting")
    public ResponseEntity<Void> submitHarvestingData(@RequestBody HarvestingData harvestingData) {
        harvestingService.saveHarvestingData(harvestingData);
        return ResponseEntity.ok().build();
    }
}

