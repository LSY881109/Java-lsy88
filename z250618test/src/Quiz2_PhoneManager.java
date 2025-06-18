import java.util.Scanner;

public class Quiz2_PhoneManager {
    public static void main(String[] args) {
        // 어디서는 접근가능, 객체 없이 반환값 없고
        // 외부에서 전달되는 문자열 받는 배열형태로 받음
        Scanner scanner = new Scanner(System.in);
        // Scanner: 자바에서 사용자로부터 키보드 입력을 받기 위한 클래스
        // new Scanner(System.in): 표준 입력(키보드)을 읽기 위한 Scanner 객체 생성
        // scanner: 우리가 만든 Scanner 객체의 이름 → 이후 입력을 받을 때 계속 사용

        System.out.print("인원수 >> ");
        int count = Integer.parseInt(scanner.nextLine());
        // int count 사용자가 입력한 인원 수를 정수로 저장하는 변수
        // Integer.parseInt(scanner.nextLine()) 문자열로 입력받은 값을 정수로 바꾼다
        // scanner.nextLine() 사용자로부터 한 줄의 문자열 입력 받는 메서드
        // scanner.nextLine() -> 사용자가 입력한 한 줄 문자열을 읽음.
        // 예: 사용자가 3을 입력하면 "3"이라는 문자열을 반환
        // 문자열 "3"을 숫자 3(int)로 바꿔줌
        // 그래서 count 변수에 정수로 저장할 수 있음
        Quiz2_Phone[] phones = new Quiz2_Phone[count];

        for (int i = 0; i < count; i++) {
            // for문 -> 반복문
            // int i = 0 → 반복을 위한 제어 변수 i를 0부터 시작
            // i < count → i가 입력한 인원 수(count)보다 작을 때까지만 반복
            // i++ → 반복할 때마다 i값을 1씩 증가
            System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
            String[] input = scanner.nextLine().split(" ");
            // scanner.nextLine() → 사용자로부터 한 줄 입력 받음
            // .split(" ") → 입력받은 문자열을 공백을 기준으로 나눔
            // String[] input → 나눈 결과를 문자열 배열로 저장
            // 예: 입력이 "홍길동 01012345678 서울"이면
            // -> input[0]="홍길동", input[1]="01012345678", input[2]="서울"

            String name = input[0];
            // 배열의 첫 번째 값 → 이름 → name 변수에 저장
            String tel = input[1];
            // 배열의 두 번째 값 → 전화번호 → tel 변수에 저장
            String address = input[2];
            // 배열의 세 번째 값 → 주소 → address 변수에 저장
            phones[i] = new Quiz2_Phone(name, tel, address);
            // 새로 입력받은 정보로 Quiz2_Phone 객체를 생성
            // phones 배열의 i번째 위치에 저장
            // 즉, 입력한 사람 정보를 객체로 만들어 배열에 저장하는 역할
        }
        System.out.println("저장되었습니다...");

        while (true) { // 무한 반복문 시작 -> exit을 입력할 때까지
            System.out.print("\n검색할 이름 >> ");
            // 사용자에게 검색할 이름을 입력하라고 요청
            String searchName = scanner.nextLine();
            // 사용자가 입력한 이름을 문자열로 받아서 searchName 변수에 저장
            // scanner.nextLine() → 사용자에게 한 줄 입력을 받고
            // 그 값을 문자열(String) 형태로 변수 searchName에 저장

            // equals와 ==의 차이점
            // equals: 주로 문자열(String)이나 객체(Object)의
            // 내용이 같은지 비교할 때 사용
            // ==: 두 변수가 가리키는 메모리 주소(참조)가 같은지,
            // 즉 같은 객체인지 비교할 때 사용
            if (searchName.equals("exit")) {
                // if는 조건문 () 안의 조건이 true일 때만 {} 안의 코드를 실행
                // 문자열 변수 searchName에 들어 있는 값이 "exit"와 같은지 비교
                // 입력한 값이 "exit"와 같다면
                System.out.println("프로그램을 종료합니다...");
                break;
                // 종료 메시지를 출력하고 break로 반복문을 빠져나감
            }

            boolean found = false;
            // boolean : 참(true) 또는 거짓(false)
            // 두 가지 값만 가질 수 있는 기본 "자료형"(primitive type)
            // found(변수 이름), 찾았다'라는 의미를 담고 있음
            // 검색 결과를 저장하는 용도
            // = false; -> 변수를 초기화할 때 처음 상태를 거짓(false)으로 설정
            // 즉, 아직 찾지 못한 상태임을 뜻
            // 요약 -> found라는 이름의 boolean 변수를 만들고, 초기값을 false로 설정하여
            // "아직 검색 대상이 발견되지 않았다"는 상태를 저장

            for (Quiz2_Phone p : phones) { // 향상된 for문(enhanced for loop)
                // 배열이나 컬렉션의 모든 요소를 순차적, 반복할 때 사용
                // (Quiz2_Phone p : phones)
                // phones 배열안에 있는 모든 Quiz2_Phone 객체를 하나씩 꺼내서
                // p라는 변수에 차례대로 저장해 반복
                // 즉, phones 배열의 각 원소가 p가 되어 반복문 몸체에서 사용

                if (p.name.equals(searchName)) {
                    // if -> 조건문으로, 괄호 안 조건이 true일 때만 중괄호 안 코드가 실행
                    // p.name -> p가 가리키는 Quiz2_Phone 객체의 name 필드(이름)를 의미
                    // .equals(searchName) ->
                    // p.name 문자열과 searchName 문자열이 내용상 같은지 비교
                    // 같으면 true, 다르면 false 반환
                    // 즉, p 객체의 이름이 사용자가 입력한 searchName과 같으면
                    // 조건문이 참이 되어 안쪽 코드를 실행

                    // p.name + "의 번호와 주소는 " + 이 부분은 문자열을 이어 붙이는(연결하는) 역할
                    System.out.println(p.name + "의 번호와 주소는 " + p.tel + ", " + p.address + " 입니다.");
                    // p.name p가 가리키는 Quiz2_Phone 객체의 이름 필드
                    // "의 번호와 주소는 " 문자열 리터럴로
                    // p.name과 p.tel, p.address 사이에 문장 형식으로 들어갑

                    // 리터럴(literal)은 프로그래밍에서 코드에 직접 '그대로' 써 놓은 값
                    // 고정된 값 그 자체 -> 숫자 100도 숫자 리터럴,
                    // 참/거짓을 나타내는 true, false 도 불리언 리터럴
                    // 코드 안에 직접 쓰여 있는 '진짜 값' 이라고 생각
                    found = true;
                    break;
                    // true값을 찾으면 즉시 종료
                }
            }

            if (!found) {
                // ! 는 논리 부정 연산자로 
                // found 값이 true면 false로, false면 true로 바꿔줌

                System.out.println(searchName + " 은(는) 없습니다.");
            }
        }

        scanner.close();
    }
}
