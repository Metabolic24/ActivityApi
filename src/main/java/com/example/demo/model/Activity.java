package com.example.demo.model;

public class Activity {
    private String activity;
    private String type;
    private Double price;
    private Integer participants;

    public Activity(String activity, String type, Double price, Integer participants) {
        this.activity = activity;
        this.type = type;
        this.price = price;
        this.participants = participants;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }
}
