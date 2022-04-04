package com.example.recyclerview04042022;

public class Discount {
    private DiscountSessionEnum discountSessionEnum;
    private String nameDiscount;

    public Discount(DiscountSessionEnum discountSessionEnum, String nameDiscount) {
        this.discountSessionEnum = discountSessionEnum;
        this.nameDiscount = nameDiscount;
    }

    public DiscountSessionEnum getDiscountSessionEnum() {
        return discountSessionEnum;
    }

    public void setDiscountSessionEnum(DiscountSessionEnum discountSessionEnum) {
        this.discountSessionEnum = discountSessionEnum;
    }

    public String getNameDiscount() {
        return nameDiscount;
    }

    public void setNameDiscount(String nameDiscount) {
        this.nameDiscount = nameDiscount;
    }
}
