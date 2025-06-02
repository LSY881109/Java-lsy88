package ch3;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n📚 도서 관리 프로그램");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 도서 정보 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 검색 (제목)");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");
            menu = scanner.nextInt();
            scanner.nextLine(); // 개행 제거

            switch (menu) {
                case 1 -> BookManager.addBook(scanner);
                case 2 -> BookManager.viewBooks();
                case 3 -> BookManager.updateBook(scanner);
                case 4 -> BookManager.deleteBook(scanner);
                case 5 -> BookManager.searchBookByTitle(scanner);
                case 0 -> System.out.println("프로그램 종료.");
                default -> System.out.println("올바른 메뉴 번호를 선택하세요.");
            }

        } while (menu != 0);

        scanner.close();
    }
}
