package util_test;

import java.util.Scanner;

import util.user.LoginService;
import util.user.UserService;

public class H2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserService.registerUser(scanner);

        LoginService.registerUser2(scanner);

        scanner.close();
    }
}
