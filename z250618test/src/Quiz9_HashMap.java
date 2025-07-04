import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Quiz9_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");

        for (int i = 0; i < 5; i++) {
            System.out.print("나라 이름, 인구 >> ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ");

            if (parts.length != 2) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                i--;
                continue;
            }

            String country = parts[0];
            int population;

            try {
                population = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("인구는 숫자로 입력하세요.");
                i--;
                continue;
            }

            nations.put(country, population);
        }

        String minCountry = null;
        int minPopulation = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : nations.entrySet()) {
            if (entry.getValue() < minPopulation) {
                minPopulation = entry.getValue();
                minCountry = entry.getKey();
            }
        }

        System.out.println("제일 인구가 적은 나라는 (" + minCountry + ", " + minPopulation + ")");
        scanner.close();
    }
}
