package com.example.demo.model;

public class ActivityError {
    private String error;

    public ActivityError() {
        error = "No activity found with the specified parameters";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
