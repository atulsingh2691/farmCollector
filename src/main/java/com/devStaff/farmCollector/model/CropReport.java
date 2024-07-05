package com.devStaff.farmCollector.model;

import lombok.Data;

@Data
public class CropReport {

    private String cropType;
    private String season;
    private double totalPlanted;
    private double totalHarvested;
}

