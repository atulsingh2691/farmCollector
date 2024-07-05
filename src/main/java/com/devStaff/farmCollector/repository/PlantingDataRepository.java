package com.devStaff.farmCollector.repository;

import com.devStaff.farmCollector.entity.PlantingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantingDataRepository extends JpaRepository<PlantingData, Long> {
    List<PlantingData> findByFarmNameAndSeason(String farmName, String season);

    List<PlantingData> findByCropTypeAndSeason(String cropType, String season);
    // Define custom queries if needed
}

