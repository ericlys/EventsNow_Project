package com.java.test.beans;

import java.util.Date;

public class Event {
    private String title;
    private Date startDate;
    private Date finalDate;
    private String theme;
    private float latitude;
    private float longitude;
    private String address;
    private String userMail;

    public Event() {
    }

    public Event(String title, Date startDate, Date finalDate, String theme, float latitude, float longitude, String address, String userMail) {
        this.title = title;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.theme = theme;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.userMail = userMail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", finalDate=" + finalDate +
                ", theme='" + theme + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", userMail='" + userMail + '\'' +
                '}';
    }
}