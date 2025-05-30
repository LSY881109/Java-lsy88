package ch2;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        System.out.println("퀴즈2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("땡땡땡 홈피 회원가입");
        System.out.println("이름을 입력하세요");
        String name = scanner.nextLine();

        System.out.println("이메일을 입력하세요");
        String email = scanner.nextLine();

        System.out.println("패스워드 입력하세요");
        String password = scanner.nextLine();

        System.out.println("출력 결과는");
        System.out.println("이름 : " + name + "이메일" + email + "패스워드" + password);

        System.out.println("ㅊㅋㅊㅋㅊㅋ");

        scanner.close();

    }
}
