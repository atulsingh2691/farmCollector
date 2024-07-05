package com.devStaff.farmCollector.model;

import lombok.Data;

@Data
public class ReportData {
    private String farmName;
    private String cropType;
    private double planted;
    private double harvested;

    // Constructor, getters, setters
}

