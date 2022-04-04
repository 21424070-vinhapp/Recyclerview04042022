package com.example.recyclerview04042022;

import java.util.ArrayList;
import java.util.Date;

public class FoodModel {
    private int image;
    private String name;
    private String address;
    private ArrayList<ServiceEnum> arrServiceEnum;
    private Discount discount;
    private Date timeOpen;
    private Date timeClose;
    private float distance;
    private boolean isOpen;

    public FoodModel(int image, String name, String address, ArrayList<ServiceEnum> arrServiceEnum, Discount discount, Date timeOpen, Date timeClose, float distance) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.arrServiceEnum = arrServiceEnum;
        this.discount = discount;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
        this.distance = distance;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<ServiceEnum> getArrServiceEnum() {
        return arrServiceEnum;
    }

    public void setArrServiceEnum(ArrayList<ServiceEnum> arrServiceEnum) {
        this.arrServiceEnum = arrServiceEnum;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Date getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(Date timeOpen) {
        this.timeOpen = timeOpen;
    }

    public Date getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(Date timeClose) {
        this.timeClose = timeClose;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
