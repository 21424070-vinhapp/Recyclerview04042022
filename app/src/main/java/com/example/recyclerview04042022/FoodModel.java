package com.example.recyclerview04042022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FoodModel {
    private int image;
    private String name;
    private String address;
    private List<ServiceEnum> arrServiceEnum;
    private Discount discount;
    private long timeOpen;
    private long timeClose;
    private float distance;
    private boolean isOpen;


    public FoodModel(int image, String name, String address, List<ServiceEnum> arrServiceEnum, Discount discount, long timeOpen, long timeClose, float distance, boolean isOpen) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.arrServiceEnum = arrServiceEnum;
        this.discount = discount;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
        this.distance = distance;
        this.isOpen = isOpen;
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

    public List<ServiceEnum> getArrServiceEnum() {
        return arrServiceEnum;
    }

    public void setArrServiceEnum(List<ServiceEnum> arrServiceEnum) {
        this.arrServiceEnum = arrServiceEnum;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public long getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(long timeOpen) {
        this.timeOpen = timeOpen;
    }

    public long getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(long timeClose) {
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

    @Override
    public String toString() {
        return "FoodModel{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", arrServiceEnum=" + arrServiceEnum +
                ", discount=" + discount +
                ", timeOpen=" + timeOpen +
                ", timeClose=" + timeClose +
                ", distance=" + distance +
                ", isOpen=" + isOpen +
                '}';
    }

    public static List<FoodModel> getMock()
    {
        return new ArrayList<>(Arrays.asList(
                new FoodModel(R.drawable.image_flycupcake,"Anzi - Cơm Trưa Văn Phòng","2/15 Quách Văn Tuấn, P. 12, Tân Bình, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.image_gongcha,"Cơm Gà Xối Mỡ 142 - Ba Đình","142 Ba Đình, P. 10, Quận 8, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.NIGHT,"Giảm 15%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),12.7f,true),
                new FoodModel(R.drawable.image_hanuri,"Cơm Tấm Cây Khế 3 - Nguyễn Văn Khối","126 Nguyễn Văn Khối, P. 9, Gò Vấp, TP. HCM",Arrays.asList(ServiceEnum.BUFFET,ServiceEnum.BUFFET),new Discount(DiscountSessionEnum.NOON,"Giảm 15%"),Ultils.getTime(11,30,0),Ultils.getTime(17,0,0),16.6f,true),
                new FoodModel(R.drawable.image_monkeyinblackcoffee,"Bún Bò Huế 14B","14B Đường Số 46, P. 5, Quận 4, TP. HCM",Arrays.asList(ServiceEnum.SMALL_RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 10%"),Ultils.getTime(6,0,0),Ultils.getTime(20,0,0),16.3f,true),
                new FoodModel(R.drawable.image_morico,"Mì Trộn Tên Lửa - Đường Số 21B","31 Đường Số 21B, P. Bình Trị Đông B, Bình Tân, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.NOON,"Giảm 30%"),Ultils.getTime(11,30,0),Ultils.getTime(17,0,0),14.5f,true),
                new FoodModel(R.drawable.image_pizza4p,"Dứa - Cơm Gà - Nguyễn Gia Trí","74 Nguyễn Gia Trí, Phường 25, Bình Thạnh, TP. HCM",Arrays.asList(ServiceEnum.SMALL_RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.NOON,"Giảm 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.image_saycoffee,"Anzi - Cơm Trưa Văn Phòng","2/15 Quách Văn Tuấn, P. 12, Tân Bình, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 5%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.image_sumobbq,"Anzi - Cơm Trưa Văn Phòng","2/15 Quách Văn Tuấn, P. 12, Tân Bình, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.image_sushibar,"Anzi - Cơm Trưa Văn Phòng","2/15 Quách Văn Tuấn, P. 12, Tân Bình, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.imega_baodimsum,"Anzi - Cơm Trưa Văn Phòng","2/15 Quách Văn Tuấn, P. 12, Tân Bình, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true)
        ));
    }
}
