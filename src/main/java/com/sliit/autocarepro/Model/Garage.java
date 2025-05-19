package com.sliit.autocarepro.Model;

public class Garage {

    private int garageId;
    private String branch;
    private String location;
    private String managerName;


    public Garage(int garageId, String branch, String location, String managerName) {
        this.garageId = garageId;
        this.branch   = branch;
        this.location = location;
        this.managerName  = managerName;
    }

    public int getId() { return garageId; }
    public void setId(int garageid) { this.garageId = garageid; }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return managerName;
    }
    public void setManager(String managerName) {
        this.managerName = managerName;
    }
}

