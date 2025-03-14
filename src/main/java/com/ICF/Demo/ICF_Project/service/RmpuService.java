package com.ICF.Demo.ICF_Project.service;

import com.ICF.Demo.ICF_Project.model.SensorValues;
import com.ICF.Demo.ICF_Project.repository.SensorValuesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RmpuService {
    @Autowired
    private SensorValuesRepo sensorValuesRepo;


    public SensorValues getSensorData(Integer id) {
        Optional<SensorValues> data = sensorValuesRepo.findByRmpuNumber(id);
        return data.orElse(null);
    }
    public SensorValues saveSensorData(SensorValues sensorValues){
        return sensorValuesRepo.save(sensorValues);
    }

    public SensorValues saveSenValuesWithC (SensorValues sensorValues){
        double aSap = 0.072;
        double c1 = calculateC1(sensorValues, aSap);
        double c2 = calculateC2(sensorValues, aSap);
        double totalCoolingCapacity = c1 + c2;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(totalCoolingCapacity);

        // Set calculated values
        sensorValues.setCoolingCapacityC1(c1);
        sensorValues.setCoolingCapacityC2(c2);
        sensorValues.setTotalCoolingCapacity(totalCoolingCapacity);

        // Save to database
        return sensorValuesRepo.save(sensorValues);
    }

    private double calculateC1(SensorValues sensorValues, double aSap) {
        double vSap = sensorValues.getAirVelocitySap();
        double tRap1 = sensorValues.getRap1Temp();
        double tSap = sensorValues.getSapTemp();
        double rhRap1 = sensorValues.getRelativeHumidityRap1();
        double rhSap = sensorValues.getRelativeHumiditySap();

        double qSap = (vSap * 60) * aSap;
        double psatRap1 = 0.61078 * Math.exp((17.27 * tRap1) / (tRap1 + 237.3));
        double pvRap1 = rhRap1 * psatRap1 / 100;
        double wRap1 = 0.622 * (pvRap1 / (101.325 - pvRap1)); // have to check this formula
        double vRap1 = 0.2871 * (tRap1 + 273.15) / (101.325 * (1 + (1.6078 * wRap1)));
        double psatSap = 0.61078 * Math.exp((17.27 * tSap) / (tSap + 237.3));
        double pvSap = rhSap * psatSap / 100;
        double wSap = 0.622 * (pvSap / (101.325 - pvSap)); // have to check the bracket
        double eSap = ((1.006 * tSap) + (wSap * (2501 + 1.805 * tSap))) * 0.239;
        double eRap1 = ((1.006 * tRap1) + (wRap1 * (2501 + 1.805 * tRap1))) * 0.239;
        System.out.println(vSap);
        System.out.println(tRap1);
        System.out.println(tSap);
        System.out.println(rhRap1);
        System.out.println(rhSap);

        System.out.println(qSap);
        System.out.println(psatRap1);
        System.out.println(pvRap1);
        System.out.println(wRap1);
        System.out.println(vRap1);
        System.out.println(psatSap);
        System.out.println(pvSap);
        System.out.println(wSap);
        System.out.println(eSap);
        System.out.println(eRap1);

        sensorValues.setqSapCircuit1(qSap);
        sensorValues.seteRapCircuit1(eRap1);
        sensorValues.seteSapCircuit1(eSap);
        sensorValues.setvRapCircuit1(vRap1);

        return ((qSap * 60 * (eRap1 - eSap)) / vRap1) / 3024;
    }

    private double calculateC2(SensorValues sensorValues, double aSap) {
        double vSap = sensorValues.getAirVelocitySap();
        double tRap2 = sensorValues.getRap2Temp();
        double tSap = sensorValues.getSapTemp();
        double rhRap2 = sensorValues.getRelativeHumidityRap2();
        double rhSap = sensorValues.getRelativeHumiditySap();

        double qSap = (vSap * 60) * aSap;
        double psatRap2 = 0.61078 * Math.exp((17.27 * tRap2) / (tRap2 + 237.3));
        double pvRap2 = rhRap2 * psatRap2 / 100;
        double wRap2 = 0.622 * (pvRap2 / (101.325 - pvRap2));
        double vRap2 = 0.2871 * (tRap2 + 273.15) / (101.325 * (1 + (1.6078 * wRap2)));
        double psatSap = 0.61078 * Math.exp((17.27 * tSap) / (tSap + 237.3));
        double pvSap = rhSap * psatSap / 100;
        double wSap = 0.622 * (pvSap / (101.325 - pvSap));
        double eSap = ((1.006 * tSap) + (wSap * (2501 + 1.805 * tSap))) * 0.239;
        double eRap2 = ((1.006 * tRap2) + (wRap2 * (2501 + 1.805 * tRap2))) * 0.239;


        sensorValues.setqSapCircuit2(qSap);
        sensorValues.seteRapCircuit2(eRap2);
        sensorValues.seteSapCircuit2(eSap);
        sensorValues.setvRapCircuit2(vRap2);

        System.out.println(vSap);
        System.out.println(tRap2);
        System.out.println(tSap);
        System.out.println(rhRap2);
        System.out.println(rhSap);

        System.out.println(qSap);
        System.out.println(psatRap2);
        System.out.println(pvRap2);
        System.out.println(wRap2);
        System.out.println(vRap2);
        System.out.println(psatSap);
        System.out.println(pvSap);
        System.out.println(wSap);
        System.out.println(eSap);
        System.out.println(eRap2);

        return ((qSap * 60 * (eRap2 - eSap)) / vRap2) / 3024;
    }

    public SensorValues findLatest() {
        return sensorValuesRepo.findTopByOrderByIdDesc();
    }

    public Optional<SensorValues> findByRmpuNumber(Integer rmpuNumber) {
        return sensorValuesRepo.findByRmpuNumber(rmpuNumber);
    }

    public List<SensorValues> getReportValues() {
       return sensorValuesRepo.findAll();
    }
}
