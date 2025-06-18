import java.util.Scanner;

public class Quiz6_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine().trim();

            if (line.equalsIgnoreCase("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            String[] words = line.split(",");
            int count = 0;

            for (String word : words) {
                if (!word.trim().isEmpty()) {
                    count++;
                }
            }

            System.out.println("어절 개수는 " + count);
        }

        scanner.close();
    }
}
