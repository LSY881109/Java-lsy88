package ch2;

// 메소드 1

public class Introduce {
    // 메소드 1
    public static int sum(int n, int m) {
        return n + m;
    }

    // 메소드 2
    public static int multiply(int n, int m) {
        return n * m;
    }

    // 메소드 3
    public static int sub(int n, int m) {
        return n - m;
    }

    // 메소드 4
    public static int div(int n, int m) {
        return n / m;
    }

    // 메소드 5
    public static float div_float(int n, int m) {
        return (float) n / m; // 정수를 입력 받아서 , 계산시 이것도 정수로 계산이 되니까
    }

    public static String introduce(String name, String phone, String email) {
        String introduce_myself = "저는 " + name + " 입니다. 제 전화번호 : " + phone + " 이고,이메일: " + email + "입니다.";
        return introduce_myself;
    }

    public static String introduce2(String a, String b, String c) {
        String introduce_myself = "좋아하는음식은 " + a + " 입니다. 제 취미는 : " + b + " 이고, 좋아하는게임은: " + c + "입니다.";
        return introduce_myself;
    }

    // 정적인 메소드, 이름 main
    public static void main(String[] args) {
        int result1 = sum(2, 4);
        System.out.println("더하기기능 : " + result1);

        int result2 = multiply(2, 4);
        System.out.println("곱하기 기능 : " + result2);

        int result3 = sub(8, 4);
        System.out.println("뺄셈 기능 : " + result3);

        int result4 = div(8, 4);
        System.out.println("정수 나누기 기능 = " + result4);

        float result5 = div_float(1, 3);
        System.out.println("실수 나누기 기능 = " + result5);

        // 결론,
        /*
         * 1) 클래스 영역과, 메인 함수 영역 구분
         * 2) 메인 함수로 시작 , 끝으로 한다.
         * 3) 메인 함수도 알고 보니, 정적인 함수(메소드)
         * 4) 클래스명, 파일명(.java ) 동일해야한다.
         * 5) 변수에서 , 기본형, 참조형이 있는데, 현재는 2개, int , String 타입 이야기 했고,
         * 6) 문자열을 표기시에 , 큰 따옴표로 표기해서 사용한다.
         * 7) 정적 메소드(함수)를 정의하고,
         * 8) 정적 메소드를 사용(호출), 사용시, 정의한 메소드로 가서, 액션을 하고 돌아와서 재사용.
         * 9) 클래스 명, 대문자로 시작하고, 패키지 명과, 메소드(함수)명 은 소문자로 시작하고
         * 10) 이름 작성시, 사용 가능한 특수 문자는 $, _ , 달러기호와 언더바만 사용 가능.
         * 
         */

        // 퀴즈 4 - 과제
        // 본인의 이름과, 전화번호, 이메일을 입력 받는 매개변수가 3개이고,
        // 출력값은 문자열 타입인데 : 결과는
        // 저는 {이름} 입니다.
        // 제 전화번호 : {전화번호}이고,
        // 이메일: {이메일} 입니다.
        // 출력 하는 예제 해보기.

        String intoroduce_info = introduce("이승엽", "010-1234-1234", "123@naver.com");
        System.out.println(intoroduce_info);

        // 퀴즈,
        // 내가 좋아하는 음식, 취미, 게임 등 알려주는 기능
        // 좋아하는 음식, 취미,게임 매개변수가 3개 정의
        // 출력
        //
        // 제가 좋아하는 음식은 : {음식이름} 입니다.
        // 제 취미 : {취미명}이고,
        // 좋아하는 게임: {게임명} 입니다.
        // 출력 하는 예제 해보기.

        String intoroduce2_info = introduce2("두부조림", "자전거", "게임은그닥");
        System.out.println(intoroduce2_info);

    }
}
