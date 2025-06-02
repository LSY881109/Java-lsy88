package ch3;

import java.util.Scanner;
import util.date.DateUtil;

public class BookManager {
    static final int MAX_BOOKS = 100;
    static String[] titles = new String[MAX_BOOKS];
    static String[] authors = new String[MAX_BOOKS];
    static String[] isbns = new String[MAX_BOOKS];
    static String[] registrationDates = new String[MAX_BOOKS];
    static int bookCount = 0;

    // 1. 도서 추가
    public static void addBook(Scanner scanner) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("최대 도서 수를 초과했습니다.");
            return;
        }

        System.out.print("도서 제목 입력: ");
        titles[bookCount] = scanner.nextLine();

        System.out.print("저자 입력: ");
        authors[bookCount] = scanner.nextLine();

        System.out.print("ISBN 입력: ");
        isbns[bookCount] = scanner.nextLine();

        registrationDates[bookCount] = DateUtil.getCurrentDateTime();
        System.out.println("도서 등록 완료: " + titles[bookCount]);

        bookCount++;
    }

    // 2. 도서 목록 조회
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        for (int i = 0; i < bookCount; i++) {
            System.out.println(
                    "[" + i + "] " + titles[i] + " / " + authors[i] + " / " + isbns[i] + " / " + registrationDates[i]);
        }
    }

    // 3. 도서 수정
    public static void updateBook(Scanner scanner) {
        System.out.print("수정할 도서 인덱스 입력 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        System.out.print("새 제목 입력: ");
        titles[index] = scanner.nextLine();

        System.out.print("새 저자 입력: ");
        authors[index] = scanner.nextLine();

        System.out.print("새 ISBN 입력: ");
        isbns[index] = scanner.nextLine();

        registrationDates[index] = DateUtil.getCurrentDateTime();
        System.out.println("도서 정보가 수정되었습니다.");
    }

    // 4. 도서 삭제
    public static void deleteBook(Scanner scanner) {
        System.out.print("삭제할 도서 인덱스 입력 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        for (int i = index; i < bookCount - 1; i++) {
            titles[i] = titles[i + 1];
            authors[i] = authors[i + 1];
            isbns[i] = isbns[i + 1];
            registrationDates[i] = registrationDates[i + 1];
        }

        bookCount--;
        System.out.println("도서가 삭제되었습니다.");
    }

    // 5. 도서 검색 (제목으로)
    public static void searchBookByTitle(Scanner scanner) {
        System.out.print("검색할 도서 제목 입력: ");
        String keyword = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("[" + i + "] " + titles[i] + " / " + authors[i] + " / " + isbns[i] + " / "
                        + registrationDates[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 제목의 도서를 찾을 수 없습니다.");
        }
    }
}
