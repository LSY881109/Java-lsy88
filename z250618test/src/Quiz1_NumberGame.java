import java.util.Scanner;
import java.util.Random;

public class Quiz1_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Random 무작위(렌덤)숫자 만들기 위한 클래스

        int answer = random.nextInt(100) + 1;
        // answer 정답으로 사용될 난수를 저장하는 용도로 사용
        // 1부터 100 사이의 무작위 정수값을 저장하는 역할
        // 추측값(guess)
        // random.nextInt(100)은 **0 이상 100 미만(0~99)**의 난수를 반환
        // 여기에 +1을 더하여 최종적으로 1 이상 100 이하의 난수를 생성


        int tryCount = 0;
        // tryCount 시도 횟수
        // 숫자를 입력할때마다 1씩 증가
        // 시작 값 0

        System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
        System.out.println("컴퓨터가 숫자를 생각했습니다.");

        if (answer % 2 == 0) { // answer가 짝수인지 확인하는 조건문
        // answer % 2 == 0 ->  answer 를 2로 나눈 나머지 값
        // 예) 6 % 2 = 0 (6은 짝수)
        //     7 % 2 = 1 (7은 홀수)
            System.out.println("힌트는 짝수입니다.");
        } else {
            System.out.println("힌트는 홀수입니다.");
        }

        while (true) { // 무한 반복 , break 나올때 까지
            System.out.print("1~100 사이의 값을 입력 >> ");
            String input = scanner.nextLine();
            //  scanner 객체를 사용해 사용자가 입력한 한 줄 전체를 문자열로 읽어옴
            int guess; // 정수형 변수 guess 선언

            try {
                guess = Integer.parseInt(input);
                // input 변수는 사용자가 입력한 문자열(String)
                // Integer 클래스는 문자열을 정수(int)로 변환하는 기능을 제공
                // parseInt() 메서드는 문자열을 숫자(int)로 변환
                // 변환된 정수값을 변수 guess에 저장합니다.
            } catch (NumberFormatException e) {
                // NumberFormatException
                // (예외->문자열을 숫자로 변환할 때, 변환할 수 없는 형식)
                System.out.println("숫자만 입력하세요.");
                continue;
                // continue 여기서는 잘못된 입력(숫자가 아니거나 범위 밖 숫자)이 들어왔을 때
                // 아래 코드를 실행하지 않고, 다시 사용자 입력을 받기 위해 
                // 반복문의 처음으로 돌아갑니다.
            }

            if (guess < 1 || guess > 100) {
                // guess 변수에 저장된 값이 1보다 작거나 100보다 크면
                // 조건문이 참(True)이 됨
                System.out.println("1~100 사이의 숫자만 입력하세요.");
                continue;
            }

            tryCount++; // 숫자를 입력할때마다 증가

            if (guess < answer) { 
                // 사용자 입력값 guess 가 정답 answer보다 작은지 비교
                System.out.println("더 큰 수입니다.");
            } else if (guess > answer) {
                // guess가 answer보다 큰 경우를 검사하는 조건
                System.out.println("더 작은 수입니다.");
            } else {
                //앞선 두 조건(guess < answer 와 guess > answer)이 모두 거짓이면,
                // 즉, guess가 answer와 같을 때 실행되는 부분
                System.out.println(tryCount + "회 만에 맞췄습니다.");
                break;  // 반복문 즉시 종료
            }
        }

        System.out.println("=== 게임을 종료합니다. ===");
        scanner.close();
    }
}
