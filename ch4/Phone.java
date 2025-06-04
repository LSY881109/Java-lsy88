package ch4;

public class Phone {
    String model;
    String price;
    String company;

    public void showInfo() {
        System.out.println("모델명: " + model);
        System.out.println("가격: " + price);
        System.out.println("제조사: " + company);
    }
}
