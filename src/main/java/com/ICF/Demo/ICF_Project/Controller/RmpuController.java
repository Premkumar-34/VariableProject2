package com.ICF.Demo.ICF_Project.Controller;

import com.ICF.Demo.ICF_Project.model.SensorValues;
import com.ICF.Demo.ICF_Project.service.RmpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/rmpu")
@CrossOrigin
public class RmpuController {
    @Autowired
    private RmpuService rmpuService;

//    @PostMapping("/sensor-data")
//    public ResponseEntity<?> saveSensorData(@RequestBody SensorValues sensorValues) {
//        System.out.println("Received Sensor Data: " + sensorValues);
//        if (sensorValues == null) {
//            return ResponseEntity.badRequest().body("Invalid Sensor Data");
//        }
//
//        SensorValues savedSensorValues = rmpuService.saveSensorData(sensorValues);
//        return ResponseEntity.ok().body(Map.of("message", "Data Saved", "sensorData", savedSensorValues));
//    }
@PostMapping("/sensor-data")
public ResponseEntity<?> saveSensorData(@RequestBody SensorValues sensorValues) {
    System.out.println("Received Sensor Data: " + sensorValues);
    if (sensorValues == null || sensorValues.getRmpuNumber() == null) {
        return ResponseEntity.badRequest().body(Map.of("message", "Invalid Sensor Data"));
    }

    Optional<SensorValues> existingSensor = rmpuService.findByRmpuNumber(sensorValues.getRmpuNumber());
    if (existingSensor.isPresent()){
        return ResponseEntity.badRequest().body(Map.of("message", "RMPU Number already exists. Data not saved."));
    }

    SensorValues savedSensorValues = rmpuService.saveSenValuesWithC(sensorValues);
    return ResponseEntity.ok().body(Map.of("message", "Data Saved", "sensorData", savedSensorValues));
}


    @GetMapping("/get/sensor-data/{id}")
    public ResponseEntity<SensorValues> getSensorData(@PathVariable Integer id){
        SensorValues sensorData = rmpuService.getSensorData(id);
        if(sensorData == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sensorData);
    }

    @GetMapping("/latest")
    public ResponseEntity<SensorValues> getLatestData() {
        SensorValues latestData = rmpuService.findLatest();
        return ResponseEntity.ok(latestData);
    }

    @GetMapping("/get/report-data")
    public ResponseEntity<SensorValues> getSensorValues(@RequestParam Integer rmpuNumber) {
        Optional<SensorValues> sensorValues = rmpuService.findByRmpuNumber(rmpuNumber);

        return sensorValues.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

