package ch4;

public class PhoneMain {
    public static void main(String[] args) {

        // Phone phone1 = new Phone("iphone 11", "90만원", "애플"); // 매개변수 생성자 호출
        // phone1.showInfo();
        // Phone phone2 = new Phone("iphone 12", "95만원", "애플"); // 매개변수 생성자 호출
        // phone2.showInfo();
        // Phone phone3 = new Phone("iphone 13", "100만원", "애플"); // 매개변수 생성자 호출
        // phone3.showInfo();
        // Phone1.model = "iPhone 11";
        // Phone1.price = "100만원";
        // Phone1.company = "애플";
        // Phone1.showInfo();

        // Phone Phone2 = new Phone();
        // Phone2.model = "iPhone 12";
        // Phone2.price = "105만원";
        // Phone2.company = "애플";
        // Phone2.showInfo();

        // Phone Phone3 = new Phone();
        // Phone3.model = "iPhone 13";
        // Phone3.price = "100만원";
        // Phone3.company = "애플";

        // 퀴즈2, 본인 만든 클래스에서,
        // 각각의 매개변수가 정의된 생성자를, 오버로딩해서,
        // 각각에 객체(인스턴스) 생성 해보기.
        // 정보 출력해보기.

        Phone[] phones = new Phone[5];

        Phone phone1 = new Phone("iPhone 11", "1,000,000원", "Apple");
        Phone phone2 = new Phone("iPhone 12", "1,100,000원", "Apple");
        Phone phone3 = new Phone("iPhone 13", "1,200,000원", "Apple");
        Phone phone4 = new Phone("iPhone 14", "1,300,000원", "Apple");
        Phone phone5 = new Phone("iPhone 15", "1,400,000원", "Apple");

        // 배열에 객체를 할당
        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;
        phones[3] = phone4;
        phones[4] = phone5;

        for (int i = 0; i < phones.length; i++) {
            phones[i].showInfo();

        }
    }
}
