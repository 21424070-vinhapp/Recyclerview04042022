package com.example.recyclerview04042022;

public enum ServiceEnum {
    SMALL_RESTAURANT("Quán ăn nhỏ"),
    BIRTHDAY("Sinh nhật"),
    FAMILY("Gia đình"),
    GROUP("Nhóm hội"),
    BUFFET("Buffet"),
    RESTAURANT("Nhà hàng");

    private final String name;

    private ServiceEnum(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

}
