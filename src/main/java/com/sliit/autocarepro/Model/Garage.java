package com.sliit.autocarepro.Model;

public class Garage {

    private int garageid;
    private String branch;
    private String location;
    private String managerName;


    public Garage(int garageid,String branch, String location, String managerName) {
        this.garageid = garageid;
        this.branch   = branch;
        this.location = location;
        this.managerName  = managerName;
    }

    public int getId() { return garageid; }
    public void setId(int garageid) { this.garageid = garageid; }

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

