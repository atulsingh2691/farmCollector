package com.devStaff.farmCollector.controllor;

import com.devStaff.farmCollector.entity.PlantingData;
import com.devStaff.farmCollector.service.PlantingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlantingController {

    @Autowired
    private PlantingService plantingService;

    @PostMapping("/planting")
    public ResponseEntity<Void> submitPlantingData(@RequestBody PlantingData plantingData) {
        plantingService.savePlantingData(plantingData);
        return ResponseEntity.ok().build();
    }
}
