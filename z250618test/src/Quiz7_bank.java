import java.util.HashMap;
import java.util.Scanner;

public class Quiz7_bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> accounts = new HashMap<>();

        System.out.println("<< 통장 관리 프로그램입니다. >>");

        while (true) {
            System.out.print("이름과 금액 입력>> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length != 2) {
                System.out.println("이름과 금액을 띄어쓰기로 구분해서 입력하세요.");
                continue;
            }

            String name = parts[0];
            int amount;

            try {
                amount = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("금액은 숫자로 입력해야 합니다.");
                continue;
            }

            int currentBalance = 0;
            if (accounts.containsKey(name)) {
                currentBalance = accounts.get(name);
            }

            accounts.put(name, currentBalance + amount);

            for (String key : accounts.keySet()) {
                System.out.print("(" + key + ">" + accounts.get(key) + "원)");
            }
            System.out.println();
        }

        scanner.close();
    }
}
