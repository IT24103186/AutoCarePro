package com.sliit.autocarepro.Model;

import java.util.Date;

public class Vehicle {
    private int vehicleId;
    private String make;        // eg. Toyota
    private String model;       // eg. CR-V
    private String color;       // eg. White
    private Date year;        // eg. 2020
    private String plateNumber; // eg. CAR-1234
    private String VIN;         // eg. 1HGCM82633A004352

    public Vehicle(int vehicleId, String make, String model, String color, Date year, String plateNumber, String VIN) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.plateNumber = plateNumber;
        this.VIN = VIN;
    }

    public int getVehicleId() {return vehicleId;}
    public void setVehicleId(int vehicleId) {this.vehicleId = vehicleId;}

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Date getYear() {
        return year;
    }
    public void setYear(Date year) {
        this.year = year;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

}
