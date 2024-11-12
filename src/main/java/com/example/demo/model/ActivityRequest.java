package com.example.demo.model;

public class ActivityRequest {

    private String type;
    private Integer participants;
    private Double minPrice;
    private Double maxPrice;

    public ActivityRequest() {
    }

    public ActivityRequest(String type, Integer participants, Double minPrice, Double maxPrice) {
        this.type = type;
        this.participants = participants;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
