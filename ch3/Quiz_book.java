package ch3;

import java.util.Scanner;
import util.date.DateUtil;

public class Quiz_book {

    static final int MAX_BOOKS = 100;
    // 100권 제한 fial값 변경 못하게 고정
    // static 클래스 전체 동일한 값 공유
    static String[] bookTitles = new String[MAX_BOOKS];
    // 도서 제목 저장 문자 배열
    static String[] authors = new String[MAX_BOOKS];
    // 저자명
    static String[] publishers = new String[MAX_BOOKS];
    // 출판사명
    static String[] regDates = new String[MAX_BOOKS];
    // 등록일

    static int bookCount = 0;
    // 카운트가 0 일때 , 4개배열에 같은 인덱스로 저장

    // 도서 추가
    // public : 외부 클래스에서도 접근 가능
    // static : 객체 생성 없이 클래스 이름으로 바로 호출
    // void : 반환값 없음
    // Scanner scanner : 사용자 입력을 받기 위한 도구
    public static void addBook(Scanner scanner) {
        // if (bookCount < MAX_BOOKS) 배열 여유 공간 확인
        // MAX_BOOK = 100 보다 작을때만 추가 가능
        if (bookCount < MAX_BOOKS) {
            System.out.print("도서명을 입력하세요: ");
            String title = scanner.nextLine();
            bookTitles[bookCount] = title; // 사용자 > 도서명 입력받아 bookTitles 배열에 저장

            System.out.print("저자를 입력하세요: ");
            String author = scanner.nextLine();
            authors[bookCount] = author; // 저자 입력 받아 author 배열에 저장

            System.out.print("출판사를 입력하세요: ");
            String publisher = scanner.nextLine();
            publishers[bookCount] = publisher; // 출판사 입력 받아 publishers 배열에 저장

            regDates[bookCount] = DateUtil.getCurrentDateTime(); // 등록일 자동 저장
            bookCount++; // 도서수 증가, 도서가 들어갈 인덱스를 가리키도록 bookCount 증가시킴

            System.out.println("도서가 추가되었습니다: " + title + ", " + author + ", " + publisher); // 결과 출력
        } else {
            System.out.println("도서 수가 최대치를 초과했습니다.");
            // 도서수 초과시 출력
        }
    }

    // 도서 전체 조회
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return; // bookCount == 0 , 저장된 도서가 없을 경우(0일경우) 출력
        }
        System.out.println("등록된 도서 목록:"); // 조회전 도서목록 출력
        for (int i = 0; i < bookCount; i++) {
            System.out.println(
                    "[" + i + "] " + bookTitles[i] + ", " + authors[i] + ", " + publishers[i] + ", " + regDates[i]);
        } // 도서수 (bookCount) 만큼 반복
          // 인덱스 번호와 도서명, 저자, 출판사, 등록일을 같이 출력
    }

    // 도서 수정
    public static void updateBook(Scanner scanner) {
        System.out.print("수정할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        // 0 ~ bookCount -1) + 범위 알려주는이유 배열이
        // 0부터시작
        int index = scanner.nextInt(); // 사용자 입력 인덱스 int타입 변수 인덱스 저장
        scanner.nextLine(); // 개행 제거
                            // 위에서 nextInt() 사용했기 때문에 Enter(개행 문자)
                            // 가 입력 버퍼에 남아있음, 이 개행 문자를 제거 하지
                            // 않으면 다음 nextLine() 입력이 제데로 안됨
                            // 안보이는 엔터 제거용!

        if (index < 0 || index >= bookCount) {
            // index < 0 또는 index >= bookCount 이면 잘못된 값
            System.out.println("잘못된 인덱스입니다.");// 배열 범위를 벗어난 값인지 확인
            return; // 수정 작업 종료
        }

        System.out.print("새 도서명을 입력하세요: ");
        bookTitles[index] = scanner.nextLine();

        System.out.print("새 저자를 입력하세요: ");
        authors[index] = scanner.nextLine();

        System.out.print("새 출판사를 입력하세요: ");
        publishers[index] = scanner.nextLine();

        regDates[index] = DateUtil.getCurrentDateTime();

        System.out.println("도서 정보가 수정되었습니다.");
    }

    // 도서 삭제
    public static void deleteBook(Scanner scanner) {
        System.out.print("삭제할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        System.out.println("삭제할 도서: " + bookTitles[index]);
        // 삭제할 도서 제목

        // 배열 기반 구조에서 중간 요소를 삭제할수 없어서
        // 삭제후 뒤에 요소들을 한칸씩 앞으루 당김
        for (int i = index; i < bookCount - 1; i++) {
            bookTitles[i] = bookTitles[i + 1];
            authors[i] = authors[i + 1];
            publishers[i] = publishers[i + 1];
            regDates[i] = regDates[i + 1];
        }

        // 삭제후 데이터를 한칸씩 당겼기 때문에
        // 마지막 요소 bookCount - 1 중복 되거나 유효하지 않은값이됨
        // 그래서 해당 위치에 저장된 데이터는 null로 초기화하여 정리
        bookTitles[bookCount - 1] = null;
        authors[bookCount - 1] = null;
        publishers[bookCount - 1] = null;
        regDates[bookCount - 1] = null;

        bookCount--; // 전체 도서수를 1만큼 줄임
        System.out.println("도서가 삭제되었습니다.");
    }

    // 도서 검색
    public static void searchBook(Scanner scanner) {
        System.out.print("검색할 도서명 또는 저자를 입력하세요: ");
        // 사용자 > 도서명 , 저자명 입력 받음
        String query = scanner.nextLine();
        // 입력받은 문자열을 query저장, 아래에서 비교
        boolean found = false; // 검색 여부를 찾았는지 여부를 저장하는 변수

        for (int i = 0; i < bookCount; i++) { // 현재 등록된 도서 수만큼 배열 순회
            if (bookTitles[i].contains(query) || authors[i].contains(query)) {
                System.out.println(
                        "[" + i + "] " + bookTitles[i] + ", " + authors[i] + ", " + publishers[i] + ", " + regDates[i]);
                // 조건
                found = true; // 위 조건을 만족할 경우 found = true;로 설정
                // "검색 결과 없음" 메시지 방지
                // 제목 또는 저자에 query가 포함되어 있는지확인
                // contains() 해당 문자열이 포함되어 있으면 true를 반환
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
            // 제목,저자에 입력한 query가 단하나라도 포함 되지 않았다면
            // 결과 없을 경우 메시지 출력
        }
    }

    // 더미 도서 추가
    public static void addDummyBooks() {
        for (int i = 0; i < 5; i++) {
            if (bookCount < MAX_BOOKS) {
                bookTitles[bookCount] = "더미도서" + (i + 1);
                authors[bookCount] = "저자" + (i + 1);
                publishers[bookCount] = "출판사" + (i + 1);
                regDates[bookCount] = DateUtil.getCurrentDateTime();
                bookCount++;
            }
        }
        System.out.println("더미 도서 5권이 추가되었습니다.");
    }

    // 메인 메서드: 전체 메뉴 구성
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner 객체 생성
        while (true) { // 무한 반복문 시작
            System.out.println("\n=== 도서 관리 프로그램 ===");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 검색");
            System.out.println("6. 더미 도서 추가");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");
            // 메뉴 출력
            String choice = scanner.nextLine();
            // 메뉴 선택 문자열로 입력 받음

            switch (choice) {
                case "1":
                    addBook(scanner);
                    break;
                case "2":
                    viewBooks();
                    break;
                case "3":
                    updateBook(scanner);
                    break;
                case "4":
                    deleteBook(scanner);
                    break;
                case "5":
                    searchBook(scanner);
                    break;
                case "6":
                    addDummyBooks();
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        } // while (true) 루프 끝, 무한 반복 계속
    } // main 메서드 끝
}
