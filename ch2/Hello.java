package ch2; // package 폴더

// public : 접근 지정자, 파란색으로 표기 되는 부분은 예약어 키워드
// 변수명으로 따로 사용 안됨.
// 파일명.java -> 파일명= 클래스명, 주의사항) 클래스명, 시작은 대문자
// 특수문자는 _ , $ 이용가능
// 패키지명, 변수명, 함수명(메소드) 소문자로 시작하고
// 

public class Hello { // class : 변수, 상수, 함수 기능들의 묶음
    // 정적인 메소드 하나 생성
    // static : 정적 지우너, 공유 자원, 나중에 인스턴스 개념과 구분해서
    // 따로 설명이 필요함.
    // int : 기본형 타입, 현재는 함수의 반환 타입
    // (int n, int m) : 매개 변수, 받는 변수
    // return : 함수를 실행 후, 반환하는 값
    // 결론 정수로 n,m 값이 들어오면 , 2개의 닶을 더해서 , 반환 한다
    // public static [반환값의 타입] [함수의 이름][매개변수1], [매개변수2]{
    // retrun 반환 하는 값}

    public static int sum(int n, int m) {
        return n + m;
    }
    // public : 접근 지정자, 누구나 다 접근이 된다(모두 볼수 있다)
    // static : 공유 자원의 의미
    // void : 반환값이 없다는 의미
    // main : 함수이름, 메인 함수에서 실행해서, 메인으로 종료함.
    // string{} args : string : 문자열 타입
    // [] : 배열을 의미
    // args, 배열의 이름 (변경 가능)

    public static void main(String[] args) {
        // sum(100, 200) : 함수 이용
        // 사용법 : [받을 변수 타입 [받는 변수명]] = 함수이름(인자값1, 인자값2)
        // 함수를 사용하면 -> 함수가 정의 된곳으로 이동힘.
        int result = sum(100, 200);
        // 자바, 문자열은 무조건 ("")큰 따옴표 사이에 작성.
        // 문자열 + 숫자 = 문자열 (타입)
        System.out.println("sum 이라는 함수 이용해서 결과 출력 : " + result);
        // 퀴즈 1,
        // 정적 메소드 한자 만들어서, 곱하기 기능이고,
        // result에 담아서 출력하기

        int result2 = multiply(200, 4);
        System.out.println("곱하기 기능 = " + result2);

    }

    public static int multiply(int n, int m) {
        return n * m;
    }

}
