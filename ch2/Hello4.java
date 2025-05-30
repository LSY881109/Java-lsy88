package ch2;

public class Hello4 {
    public static void main(String[] args) {
        System.out.println("출력");
        // 만들었던 클래스를 불러와서, 재사용 해보기
        // 본인소개 및,
        String myinfo = Introduce.introduce("이승엽", "010-1234", "1234@naver.com");
        System.out.println(myinfo);

        String myinfo2 = Introduce.introduce2("111111", "22222", "33333");
        System.out.println(myinfo2);

        // 퀴즈 1
        // introduce 클래스에, 정의한 사칙연산 메소르를 이용해서, 각각 계산 결과를
        // result1, result2, result3, result4 변수에 담아서 출력해보기

        int result1 = Introduce.sum(4, 2);
        System.out.println(result1);

        int result2 = Introduce.multiply(4, 4);
        System.out.println(result2);

        int result3 = Introduce.sub(10, 2);
        System.out.println(result3);

        int result4 = Introduce.div(20, 5);
        System.out.println(result4);

        Float result5 = Introduce.div_float(1, 3);
        System.out.println(result5);

    }
}
