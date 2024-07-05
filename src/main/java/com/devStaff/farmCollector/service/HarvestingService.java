package com.devStaff.farmCollector.service;

import com.devStaff.farmCollector.entity.HarvestingData;
import com.devStaff.farmCollector.repository.HarvestingDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HarvestingService {

    @Autowired
    private HarvestingDataRepository harvestingDataRepository;

    public void saveHarvestingData(HarvestingData harvestingData) {
        harvestingDataRepository.save(harvestingData);
    }
}

