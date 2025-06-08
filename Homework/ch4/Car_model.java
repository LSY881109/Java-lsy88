package Homework.ch4; // 이 파일이 속한 폴더(패키지)를 정의

public class Car_model { // 자동차 한 대의 정보를 담는 클래스

    String model;
    String price;
    String company;
    String year;
    String regdate;

    public Car_model() {
    };

    // 생성자: 자동차 정보를 모두 받아서 저장하는 역할을 함
    public Car_model(String model, String price, String company, String year, String regdate) {
        this.model = model; // 입력받은 model을 이 클래스의 model 변수에 저장
        this.price = price; // 입력받은 price를 저장
        this.company = company; // 입력받은 company를 저장
        this.year = year; // 입력받은 year를 저장
        this.regdate = regdate; // 입력받은 등록일을 저장
    }

    // 자동차 정보를 화면에 출력하는 기능
    public void showInfo() {
        System.out.println("모델명 : " + this.model); // 모델명 출력
        System.out.println("가격 : " + this.price); // 가격 출력
        System.out.println("제조사 : " + this.company); // 제조사 출력
        System.out.println("연식 : " + this.year); // 연식 출력
        System.out.println("등록일 : " + this.regdate); // 등록일 출력
    }

    // 자동차 모델명을 가져오는 메서드 (검색할 때 사용)
    public String getModel() {
        return model; // model 변수 값을 돌려줌
    }

    // 자동차 가격을 가져오는 메서드 (검색할 때 사용)
    public String getPrice() {
        return price; // price 변수 값을 돌려줌
    }
}
