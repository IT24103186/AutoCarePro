package com.sliit.autocarepro.Model;

public class Garage {

    private int id;
    private String branch;
    private String location;
    private String managerName;


    public Garage(int id,String branch, String location, String managerName) {
        this.id       = id;
        this.branch   = branch;
        this.location = location;
        this.managerName  = managerName;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

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

