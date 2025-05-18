package com.sliit.autocarepro.Model;

public class serviceType {
    private Long id;
    private String service;
    private String description;
    private String timeRequired;
    private String priceRange;

    public serviceType(Long id, String service, String description, String timeRequired, String priceRange) {
        this.id = id;
        this.service = service;
        this.description = description;
        this.timeRequired = timeRequired;
        this.priceRange = priceRange;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
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
