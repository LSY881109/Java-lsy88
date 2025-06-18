public class Quiz2_Phone {
    String name;
    // String 문자열을 저장하는 데이터 타입
    // name 변수 이름으로, 전화번호부에 저장할 사람의 이름을 담는 필드
    String tel;
    // tel 변수도 문자열 타입이며, 사람의 전화번호를 저장하는 필드
    String address;
    // address 변수 역시 문자열로, 사람의 주소 정보를 저장

    public Quiz2_Phone(String name, String tel, String address) {
     // 생성자(Constructor) 정의 매개변수 생성
        this.name = name;
        // this.name은 객체 내부의 name 필드(객체의 속성) 이하 동
        this.tel = tel;
        this.address = address;
    }
}

// public 은 접근 제한자로, 이 클래스가 어디서든 접근 가능하다는 뜻
// class 새로운 클래스를 정의할 때 사용하는 키워드
