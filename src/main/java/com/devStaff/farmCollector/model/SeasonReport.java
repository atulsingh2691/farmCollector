package com.devStaff.farmCollector.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class SeasonReport {

    private String farmName;
    private String season;
    private Map<String, ReportData> report = new HashMap<>();



    public void addToReport(String cropType, double expectedAmount, double actualAmount) {
        if (!report.containsKey(cropType)) {
            report.put(cropType, new ReportData());
        }
        ReportData data = report.get(cropType);
        data.setPlanted(expectedAmount);
        data.setHarvested(actualAmount);
    }
}

