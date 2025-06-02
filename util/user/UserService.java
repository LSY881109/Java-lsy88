// UserService.java
package util.user;

import java.util.Scanner;

import util.date.DateUtil;

public class UserService {
    public static void registerUser(Scanner scanner) {
        System.out.println("홈피 회원가입");

        System.out.print("이름 입력 > ");
        String name = scanner.nextLine();

        System.out.print("이메일 입력 > ");
        String email = scanner.nextLine();

        String password;
        while (true) {
            System.out.print("패스워드 입력해주세요 > ");
            password = scanner.nextLine();

            System.out.print("패스워드 확인 입력해주세요 > ");
            String password2 = scanner.nextLine();

            if (password.isEmpty()) {
                System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
            } else if (password.equals(password2)) {
                System.out.println("패스워드가 일치합니다");
                break;
            } else {
                System.out.println("패스워드가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        // 가입 시간 출력
        String joinTime = DateUtil.getCurrentDateTime();

        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("비밀번호 : " + password);
        System.out.println("가입 시간 : " + joinTime);
        System.out.println("회원가입 완료!");
    }

    // 여기에 loginUser 메서드도 추가해야 합니다.
    public static void loginUser(Scanner scanner) {
        System.out.print("이메일 입력 > ");
        String email = scanner.nextLine();

        System.out.print("비밀번호 입력 > ");
        String password = scanner.nextLine();

        String joinTime = DateUtil.getCurrentDateTime();
        System.out.println("회원 가입이 완료되었습니다!");
        String currentTime = DateUtil.getCurrentDateTime();
        System.out.println("가입 시간: " + currentTime);

        System.out.println("이메일: " + email);
        System.out.println("가입 시간: " + joinTime);

        // 로그인 처리 로직은 추후 구현
        System.out.println("로그인 시도: " + email + " / " + password);
    }
}
