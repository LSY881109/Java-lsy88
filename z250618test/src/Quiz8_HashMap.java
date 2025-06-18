import java.util.HashMap;
import java.util.Scanner;

public class Quiz8_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> drinks = new HashMap<>();
        drinks.put("밀키스", 700);
        drinks.put("코카콜라", 800);
        drinks.put("펩시", 1000);
        drinks.put("칠성사이다", 1200);

        Scanner scanner = new Scanner(System.in);

        System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");

        while (true) {
            System.out.print("선택 >> ");
            String choice = scanner.nextLine().trim();

            if (choice.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }

            if (drinks.containsKey(choice)) {
                System.out.println(choice + "는 " + drinks.get(choice) + "원 입니다.");
            } else {
                System.out.println(choice + "는(은) 없습니다.");
            }
        }

        scanner.close();
    }
}
