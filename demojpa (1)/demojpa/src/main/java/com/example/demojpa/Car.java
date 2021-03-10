package com.example.demojpa;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    private String brand;

    private String plateNumber;

    @Id
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
