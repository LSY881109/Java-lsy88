package util.random;

public class RandomUtil {
    // 설계 클래스
    // Math.random()을 이용한 double형 난수 생성
    public static double generateRandom() {
        double randomValue = Math.random();
        return randomValue;
    }

    // 정수 범위(min 이상 max 이하)의 난수 생성
    public static int generateRandomInRange(int min, int max) {
        int randomValue = (int) (Math.random() * (max - min + 1)) + min;
        return randomValue;
    }

    // 중복 없는 로또 번호 6개 출력 (배열 없이 특정조건없이)
    public static void generateLottoNumbers() {
        int n1 = generateRandomInRange(1, 45);

        int n2;
        do {
            n2 = generateRandomInRange(1, 45);
        } while (n2 == n1);

        int n3;
        do {
            n3 = generateRandomInRange(1, 45);
        } while (n3 == n1 || n3 == n2);

        int n4;
        do {
            n4 = generateRandomInRange(1, 45);
        } while (n4 == n1 || n4 == n2 || n4 == n3);

        int n5;
        do {
            n5 = generateRandomInRange(1, 45);
        } while (n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4);

        int n6;
        do {
            n6 = generateRandomInRange(1, 45);
        } while (n6 == n1 || n6 == n2 || n6 == n3 || n6 == n4 || n6 == n5);

        System.out.println("나의 자동 로또 번호 생성기 사용한 번호: " +
                n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);
    }
}
