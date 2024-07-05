package com.devStaff.farmCollector.repository;

import com.devStaff.farmCollector.entity.HarvestingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HarvestingDataRepository extends JpaRepository<HarvestingData, Long> {
    List<HarvestingData> findByFarmNameAndSeason(String farmName, String season);

    List<HarvestingData> findByCropTypeAndSeason(String cropType, String season);
    // Define custom queries if needed
}

