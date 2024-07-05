package com.devStaff.farmCollector.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class HarvestingData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String farmName;
    private String cropType;
    private double actualAmount;

    // Constructors, getters, setters
    public HarvestingData() {
    }

    public HarvestingData(String farmName, String cropType, double actualAmount) {
        this.farmName = farmName;
        this.cropType = cropType;
        this.actualAmount = actualAmount;
    }
}
