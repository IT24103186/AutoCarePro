package com.sliit.autocarepro.Model;

public class vehicle {
    private String make;        // eg. Toyota
    private String model;       // eg. CR-V
    private String color;       // eg. White
    private String year;        // eg. 2020
    private String plateNumber; // eg. CAR-1234
    private String VIN;         // eg. 1HGCM82633A004352

    public vehicle(String make, String model, String color, String year, String plateNumber, String VIN) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.plateNumber = plateNumber;
        this.VIN = VIN;
    }

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

    public String getYear(String year) {
        return year;
    }
    public void setYear(String year) {
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
