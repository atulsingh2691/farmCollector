package com.devStaff.farmCollector.service;

import com.devStaff.farmCollector.entity.PlantingData;
import com.devStaff.farmCollector.repository.PlantingDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantingService {

    @Autowired
    private PlantingDataRepository plantingDataRepository;

    public void savePlantingData(PlantingData plantingData) {
        plantingDataRepository.save(plantingData);
    }
}

