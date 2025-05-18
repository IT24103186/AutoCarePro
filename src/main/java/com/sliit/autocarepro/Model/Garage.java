package com.sliit.autocarepro.Model;

public class Garage {

    private String id;
    private String branch;
    private String location;
    private String managerName;

    public Garage() { }

    public Garage(String id,String branch, String location, String manager) {
        this.id       = id;
        this.branch   = branch;
        this.location = location;
        this.managerName  = manager;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

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
    public void setManager(String manager) {
        this.managerName = manager;
    }
}

