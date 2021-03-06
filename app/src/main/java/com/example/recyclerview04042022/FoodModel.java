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
                new FoodModel(R.drawable.image_flycupcake,"Anzi - C??m Tr??a V??n Ph??ng","2/15 Qu??ch V??n Tu???n, P. 12, T??n B??nh, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.image_gongcha,"C??m G?? X???i M??? 142 - Ba ????nh","142 Ba ????nh, P. 10, Qu???n 8, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.NIGHT,"Gi???m 15%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),12.7f,true),
                new FoodModel(R.drawable.image_hanuri,"C??m T???m C??y Kh??? 3 - Nguy???n V??n Kh???i","126 Nguy???n V??n Kh???i, P. 9, G?? V???p, TP. HCM",Arrays.asList(ServiceEnum.BUFFET,ServiceEnum.BUFFET),new Discount(DiscountSessionEnum.NOON,"Gi???m 15%"),Ultils.getTime(11,30,0),Ultils.getTime(17,0,0),16.6f,true),
                new FoodModel(R.drawable.image_monkeyinblackcoffee,"B??n B?? Hu??? 14B","14B ???????ng S??? 46, P. 5, Qu???n 4, TP. HCM",Arrays.asList(ServiceEnum.SMALL_RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 10%"),Ultils.getTime(6,0,0),Ultils.getTime(20,0,0),16.3f,true),
                new FoodModel(R.drawable.image_morico,"M?? Tr???n T??n L???a - ???????ng S??? 21B","31 ???????ng S??? 21B, P. B??nh Tr??? ????ng B, B??nh T??n, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.NOON,"Gi???m 30%"),Ultils.getTime(11,30,0),Ultils.getTime(17,0,0),14.5f,true),
                new FoodModel(R.drawable.image_pizza4p,"D???a - C??m G?? - Nguy???n Gia Tr??","74 Nguy???n Gia Tr??, Ph?????ng 25, B??nh Th???nh, TP. HCM",Arrays.asList(ServiceEnum.SMALL_RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.NOON,"Gi???m 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.image_saycoffee,"Y???n S??o Tr???i Nam - T??? Y???n Ch??ng S???n T??? Ch???n ","8 Nguy???n Huy L?????ng, P. 14, B??nh Th???nh, TP. HCM, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 5%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.image_sumobbq,"??n V???t Mr. Ph????ng - ???????ng S??? 19","4 ???????ng S??? 19, P. 4, Qu???n 4, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.image_sushibar,"Anzi - C??m Tr??a V??n Ph??ng","2/15 Qu??ch V??n Tu???n, P. 12, T??n B??nh, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.MORNING,"Gi???m 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true),
                new FoodModel(R.drawable.imega_baodimsum,"Anzi - C??m Tr??a V??n Ph??ng","2/15 Qu??ch V??n Tu???n, P. 12, T??n B??nh, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 20%"),Ultils.getTime(7,0,0),Ultils.getTime(22,0,0),13,true)
        ));
    }
}
