package com.jobs.planb.model;

public class Jobs {

    private Integer id;
    private String job;
    private String location;

    public Jobs(String job, String location) {
        this.job = job;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
