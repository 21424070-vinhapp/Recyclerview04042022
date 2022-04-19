package com.example.recyclerview04042022;

public enum DiscountSessionEnum {
    MORNING("Buổi sáng"), NOON("Buổi trưa"), NIGHT("Buổi tối"), ALL_TIME("Cả ngày");
    private final String name;

    private DiscountSessionEnum(String s) {
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
