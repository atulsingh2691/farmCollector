package com.devStaff.farmCollector.service;

import com.devStaff.farmCollector.entity.HarvestingData;
import com.devStaff.farmCollector.entity.PlantingData;
import com.devStaff.farmCollector.model.CropReport;
import com.devStaff.farmCollector.model.SeasonReport;
import com.devStaff.farmCollector.repository.HarvestingDataRepository;
import com.devStaff.farmCollector.repository.PlantingDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportsService {

    @Autowired
    private PlantingDataRepository plantingDataRepository;

    @Autowired
    private HarvestingDataRepository harvestingDataRepository;

    public SeasonReport getFarmReport(String farmName, String season) {
        List<PlantingData> plantingData = plantingDataRepository.findByFarmNameAndSeason(farmName, season);
        List<HarvestingData> harvestingData = harvestingDataRepository.findByFarmNameAndSeason(farmName, season);

        return generateSeasonReport(farmName, season, plantingData, harvestingData);
    }

    public CropReport getCropReport(String cropType, String season) {
        List<PlantingData> plantingData = plantingDataRepository.findByCropTypeAndSeason(cropType, season);
        List<HarvestingData> harvestingData = harvestingDataRepository.findByCropTypeAndSeason(cropType, season);

        return generateCropReport(cropType, season, plantingData, harvestingData);
    }

    private SeasonReport generateSeasonReport(String farmName, String season, List<PlantingData> plantingData, List<HarvestingData> harvestingData) {
        SeasonReport report = new SeasonReport();
        report.setFarmName(farmName);
        report.setSeason(season);

        for (PlantingData planting : plantingData) {
            report.addToReport(planting.getCropType(), planting.getExpectedAmount(), 0.0);
        }

        for (HarvestingData harvesting : harvestingData) {
            report.addToReport(harvesting.getCropType(), 0.0, harvesting.getActualAmount());
        }

        return report;
    }

    private CropReport generateCropReport(String cropType, String season, List<PlantingData> plantingData, List<HarvestingData> harvestingData) {
        CropReport report = new CropReport();
        report.setCropType(cropType);
        report.setSeason(season);

        double totalPlanted = plantingData.stream().mapToDouble(PlantingData::getExpectedAmount).sum();
        double totalHarvested = harvestingData.stream().mapToDouble(HarvestingData::getActualAmount).sum();

        report.setTotalPlanted(totalPlanted);
        report.setTotalHarvested(totalHarvested);

        return report;
    }
}

