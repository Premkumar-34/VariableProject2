package com.ICF.Demo.ICF_Project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rmpu_status")

public class RmpuStatus {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
