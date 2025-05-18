package com.sliit.autocarepro.Model;

public class ServiceType {
    private int id;
    private String service;
    private String description;
    private String timeRequired;
    private String priceRange;

    public ServiceType(int id, String service, String description, String timeRequired, String priceRange) {
        this.id = id;
        this.service = service;
        this.description = description;
        this.timeRequired = timeRequired;
        this.priceRange = priceRange;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTimeRequired() {
        return timeRequired;
    }
    public void setTimeRequired(String timeRequired) {
        this.timeRequired = timeRequired;
    }
    public String getPriceRange() {
        return priceRange;
    }
    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

}
