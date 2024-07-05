package com.devStaff.farmCollector.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class PlantingData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String farmName;
    private String season;
    private double plantingArea;
    private String cropType;
    private double expectedAmount;

    // Constructors, getters, setters, and other methods

    public PlantingData() {
    }

    public PlantingData(String farmName, String season, double plantingArea, String cropType, double expectedAmount) {
        this.farmName = farmName;
        this.season = season;
        this.plantingArea = plantingArea;
        this.cropType = cropType;
        this.expectedAmount = expectedAmount;
    }
}

