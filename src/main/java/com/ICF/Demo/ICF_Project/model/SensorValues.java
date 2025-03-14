package com.ICF.Demo.ICF_Project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sensor_values")
public class SensorValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer blowerTopStatus;
    private Integer cd1TopStatus;
    private Integer cd2TopStatus;
    private Integer ohpStatus;
    private Integer lp1Status;
    private Integer lp2Status;
    private Integer hp1Status;
    private Integer hp2Status;
    private Integer cpStatus;
    private Integer blowerStatus;
    private Integer compressor1Status;
    private Integer compressor2Status;
    private Integer condenser1Status;
    private Integer condenser2Status;
    private Integer heaterMpcb;
    private Integer blowerMpcb;
    private Integer compressor1Mpcb;
    private Integer compressor2Mpcb;
    private Integer condenser1Mpcb;
    private Integer condenser2Mpcb;

    private Integer rmpuNumber;

    private Double hotChamberTemp;
    private Double coldChamberTemp;
    private Double relativeHumiditySap;
    private Double relativeHumidityRap1;
    private Double relativeHumidityRap2;
    private Double relativeHumidityColdChamber;
    private Double rap1Temp;
    private Double rap2Temp;
    private Double sapTemp;
    private Double airVelocityRap1;
    private Double airVelocityRap2;
    private Double airVelocitySap;

    private Double coolingCapacityC1;
    private Double coolingCapacityC2;
    private Double totalCoolingCapacity;

    private Double qSapCircuit1;  //quantity of air delivered circuit 1
    private Double qSapCircuit2;  //quantity of air delivered circuit 2

    private Double eRapCircuit1;  //enthalpy of circuit 1 RAP

    private Double eRapCircuit2;  // enthalpy of circuit 2 RAP

    private Double eSapCircuit1;  // enthalpy of circuit 1 SAP
    private Double eSapCircuit2;  //enthalpy of circuit 2 SAP


    private Double vRapCircuit1; // Specific volume cir 1
    private Double vRapCircuit2; // specific volume cir 2

    public Double getqSapCircuit1() {
        return qSapCircuit1;
    }

    public void setqSapCircuit1(Double qSapCircuit1) {
        this.qSapCircuit1 = qSapCircuit1;
    }

    public Double getqSapCircuit2() {
        return qSapCircuit2;
    }

    public void setqSapCircuit2(Double qSapCircuit2) {
        this.qSapCircuit2 = qSapCircuit2;
    }

    public Double geteRapCircuit1() {
        return eRapCircuit1;
    }

    public void seteRapCircuit1(Double eRapCircuit1) {
        this.eRapCircuit1 = eRapCircuit1;
    }

    public Double geteRapCircuit2() {
        return eRapCircuit2;
    }

    public void seteRapCircuit2(Double eRapCircuit2) {
        this.eRapCircuit2 = eRapCircuit2;
    }

    public Double geteSapCircuit1() {
        return eSapCircuit1;
    }

    public void seteSapCircuit1(Double eSapCircuit1) {
        this.eSapCircuit1 = eSapCircuit1;
    }

    public Double geteSapCircuit2() {
        return eSapCircuit2;
    }

    public void seteSapCircuit2(Double eSapCircuit2) {
        this.eSapCircuit2 = eSapCircuit2;
    }

    public Double getvRapCircuit1() {
        return vRapCircuit1;
    }

    public void setvRapCircuit1(Double vRapCircuit1) {
        this.vRapCircuit1 = vRapCircuit1;
    }

    public Double getvRapCircuit2() {
        return vRapCircuit2;
    }

    public void setvRapCircuit2(Double vRapCircuit2) {
        this.vRapCircuit2 = vRapCircuit2;
    }

    public Integer getBlowerTopStatus() {
        return blowerTopStatus;
    }

    public void setBlowerTopStatus(Integer blowerTopStatus) {
        this.blowerTopStatus = blowerTopStatus;
    }

    public Integer getCd1TopStatus() {
        return cd1TopStatus;
    }

    public void setCd1TopStatus(Integer cd1TopStatus) {
        this.cd1TopStatus = cd1TopStatus;
    }

    public Integer getCd2TopStatus() {
        return cd2TopStatus;
    }

    public void setCd2TopStatus(Integer cd2TopStatus) {
        this.cd2TopStatus = cd2TopStatus;
    }

    public Integer getOhpStatus() {
        return ohpStatus;
    }

    public void setOhpStatus(Integer ohpStatus) {
        this.ohpStatus = ohpStatus;
    }

    public Integer getRmpuNumber() {
        return rmpuNumber;
    }

    public void setRmpuNumber(Integer rmpuNumber) {
        this.rmpuNumber = rmpuNumber;
    }

    public Integer getLp1Status() {
        return lp1Status;
    }

    public void setLp1Status(Integer lp1Status) {
        this.lp1Status = lp1Status;
    }

    public Integer getLp2Status() {
        return lp2Status;
    }

    public void setLp2Status(Integer lp2Status) {
        this.lp2Status = lp2Status;
    }

    public Integer getHp1Status() {
        return hp1Status;
    }

    public void setHp1Status(Integer hp1Status) {
        this.hp1Status = hp1Status;
    }

    public Integer getHp2Status() {
        return hp2Status;
    }

    public void setHp2Status(Integer hp2Status) {
        this.hp2Status = hp2Status;
    }

    public Integer getCpStatus() {
        return cpStatus;
    }

    public void setCpStatus(Integer cpStatus) {
        this.cpStatus = cpStatus;
    }

    public Integer getBlowerStatus() {
        return blowerStatus;
    }

    public void setBlowerStatus(Integer blowerStatus) {
        this.blowerStatus = blowerStatus;
    }

    public Integer getCompressor1Status() {
        return compressor1Status;
    }

    public void setCompressor1Status(Integer compressor1Status) {
        this.compressor1Status = compressor1Status;
    }

    public Integer getCompressor2Status() {
        return compressor2Status;
    }

    public void setCompressor2Status(Integer compressor2Status) {
        this.compressor2Status = compressor2Status;
    }

    public Integer getCondenser1Status() {
        return condenser1Status;
    }

    public void setCondenser1Status(Integer condenser1Status) {
        this.condenser1Status = condenser1Status;
    }

    public Integer getCondenser2Status() {
        return condenser2Status;
    }

    public void setCondenser2Status(Integer condenser2Status) {
        this.condenser2Status = condenser2Status;
    }

    public Integer getHeaterMpcb() {
        return heaterMpcb;
    }

    public void setHeaterMpcb(Integer heaterMpcb) {
        this.heaterMpcb = heaterMpcb;
    }

    public Integer getBlowerMpcb() {
        return blowerMpcb;
    }

    public void setBlowerMpcb(Integer blowerMpcb) {
        this.blowerMpcb = blowerMpcb;
    }

    public Integer getCompressor1Mpcb() {
        return compressor1Mpcb;
    }

    public void setCompressor1Mpcb(Integer compressor1Mpcb) {
        this.compressor1Mpcb = compressor1Mpcb;
    }

    public Integer getCompressor2Mpcb() {
        return compressor2Mpcb;
    }

    public void setCompressor2Mpcb(Integer compressor2Mpcb) {
        this.compressor2Mpcb = compressor2Mpcb;
    }

    public Integer getCondenser1Mpcb() {
        return condenser1Mpcb;
    }

    public void setCondenser1Mpcb(Integer condenser1Mpcb) {
        this.condenser1Mpcb = condenser1Mpcb;
    }

    public Integer getCondenser2Mpcb() {
        return condenser2Mpcb;
    }

    public void setCondenser2Mpcb(Integer condenser2Mpcb) {
        this.condenser2Mpcb = condenser2Mpcb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getHotChamberTemp() {
        return hotChamberTemp;
    }

    public void setHotChamberTemp(Double hotChamberTemp) {
        this.hotChamberTemp = hotChamberTemp;
    }

    public Double getColdChamberTemp() {
        return coldChamberTemp;
    }

    public void setColdChamberTemp(Double coldChamberTemp) {
        this.coldChamberTemp = coldChamberTemp;
    }

    public Double getRelativeHumiditySap() {
        return relativeHumiditySap;
    }

    public void setRelativeHumiditySap(Double relativeHumiditySap) {
        this.relativeHumiditySap = relativeHumiditySap;
    }

    public Double getRelativeHumidityRap2() {
        return relativeHumidityRap2;
    }

    public void setRelativeHumidityRap2(Double relativeHumidityRap2) {
        this.relativeHumidityRap2 = relativeHumidityRap2;
    }


    public Double getRelativeHumidityRap1() {
        return relativeHumidityRap1;
    }

    public void setRelativeHumidityRap1(Double relativeHumidityRap1) {
        this.relativeHumidityRap1 = relativeHumidityRap1;
    }


    public Double getRelativeHumidityColdChamber() {
        return relativeHumidityColdChamber;
    }

    public void setRelativeHumidityColdChamber(Double relativeHumidityColdChamber) {
        this.relativeHumidityColdChamber = relativeHumidityColdChamber;
    }

    public Double getRap1Temp() {
        return rap1Temp;
    }

    public void setRap1Temp(Double rap1Temp) {
        this.rap1Temp = rap1Temp;
    }

    public Double getRap2Temp() {
        return rap2Temp;
    }

    public void setRap2Temp(Double rap2Temp) {
        this.rap2Temp = rap2Temp;
    }

    public Double getSapTemp() {
        return sapTemp;
    }

    public void setSapTemp(Double sapTemp) {
        this.sapTemp = sapTemp;
    }

    public Double getAirVelocityRap1() {
        return airVelocityRap1;
    }

    public void setAirVelocityRap1(Double airVelocityRap1) {
        this.airVelocityRap1 = airVelocityRap1;
    }

    public Double getAirVelocityRap2() {
        return airVelocityRap2;
    }

    public void setAirVelocityRap2(Double airVelocityRap2) {
        this.airVelocityRap2 = airVelocityRap2;
    }

    public Double getAirVelocitySap() {
        return airVelocitySap;
    }

    public void setAirVelocitySap(Double airVelocitySap) {
        this.airVelocitySap = airVelocitySap;
    }

    public Double getCoolingCapacityC1() {
        return coolingCapacityC1;
    }

    public void setCoolingCapacityC1(Double coolingCapacityC1) {
        this.coolingCapacityC1 = coolingCapacityC1;
    }

    public Double getCoolingCapacityC2() {
        return coolingCapacityC2;
    }

    public void setCoolingCapacityC2(Double coolingCapacityC2) {
        this.coolingCapacityC2 = coolingCapacityC2;
    }

    public Double getTotalCoolingCapacity() {
        return totalCoolingCapacity;
    }

    public void setTotalCoolingCapacity(Double totalCoolingCapacity) {
        this.totalCoolingCapacity = totalCoolingCapacity;
    }
}
