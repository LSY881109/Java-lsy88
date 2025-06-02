package util.user;

import java.util.Scanner;

public class LoginService {
    public static void registerUser2(Scanner scanner) {

        System.out.println("회원 가입 화면");

        String email;
        while (true) {
            System.out.print("로그인 이메일을 입력하세요: ");
            email = scanner.nextLine();

            if (email.isEmpty()) {
                System.out.println("이메일은 비워둘 수 없습니다. 다시 입력해주세요.");
                continue;
            }

            if (email.equals("admin@naver.com")) {
                System.out.println("이메일이 일치합니다.");
                break;
            } else {
                System.out.println("이메일이 일치하지 않습니다.");
            }
        }

        String password;
        while (true) {
            System.out.print("패스워드를 입력하세요: ");
            password = scanner.nextLine();

            if (password.isEmpty()) {
                System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
                continue;
            }

            if (password.equals("1234")) {
                System.out.println("패스워드가 일치합니다.");
                break;
            } else {
                System.out.println("패스워드가 일치하지 않습니다.");
            }
        }

        System.out.println("출력 결과는");
        System.out.println("로그인 이메일 : " + email);
        System.out.println("패스워드 : " + password);
        System.out.println("로그인 되었습니다.");
    }
}
