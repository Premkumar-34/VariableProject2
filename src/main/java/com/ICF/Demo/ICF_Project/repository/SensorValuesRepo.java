package com.ICF.Demo.ICF_Project.repository;

import com.ICF.Demo.ICF_Project.model.SensorValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SensorValuesRepo extends JpaRepository<SensorValues, Long> {
    SensorValues findTopByOrderByIdDesc();
    Optional<SensorValues> findByRmpuNumber(Integer rmpuNumber);
}
