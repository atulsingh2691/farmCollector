package com.devStaff.farmCollector.controllor;

import com.devStaff.farmCollector.model.CropReport;
import com.devStaff.farmCollector.model.SeasonReport;
import com.devStaff.farmCollector.service.ReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class ReportsController {

    @Autowired
    private ReportsService reportsService;

    @GetMapping("/farms/{farmName}/{season}")
    public ResponseEntity<SeasonReport> getFarmReport(@PathVariable String farmName, @PathVariable String season) {
        SeasonReport report = reportsService.getFarmReport(farmName, season);
        return ResponseEntity.ok(report);
    }

    @GetMapping("/crops/{cropType}/{season}")
    public ResponseEntity<CropReport> getCropReport(@PathVariable String cropType, @PathVariable String season) {
        CropReport report = reportsService.getCropReport(cropType, season);
        return ResponseEntity.ok(report);
    }
}

