package Homework.ch4; // 이 파일이 속한 폴더(패키지) 위치

import java.util.Scanner; // 사용자로부터 키보드 입력을 받기 위해 Scanner를 사용
import util.date.DateUtil; // 날짜와 시간을 가져오는 유틸리티 클래스 (직접 만든 클래스일 가능성이 커요)

public class Car { // Car 클래스

   static final int MAX_USERS = 100; // 최대 자동차 등록 수를 100대

   // Car_models는 자동차를 저장할 배열 (자동차 상자 100개)
   static Car_model[] Car_models = new Car_model[MAX_USERS]; // 
   static int userCount = 0; // 지금까지 등록된 자동차 수를 저장

// 1. 자동차 추가 기능
// public	다른 클래스에서도 사용할 수 있게 공개
// static	객체 생성 없이 클래스 이름으로 호출 가능
// void	값을 반환하지 않음 (그냥 실행만 함)
// updateUser	메서드 이름. 사용자 정보(여기선 자동차 정보)를 수정하는 기능
// Scanner scanner 키보드 입력을 받을 도구를 매개변수로 받음
   public static void addUser(Scanner scanner) {
      if (userCount < MAX_USERS) { // 유효성 체크를 하지 않으면 오류가 발생할시 정상 작동 X
         // userCount < MAX_USERS , 지정해놓은 MAX_USERS에 저장공간이 남았는지 확인
         System.out.println("자동차명을 입력하세요: "); // 사용자에게 자동차명을 입력하라고 요청
         String model = scanner.nextLine(); // 입력받은 자동차명을 변수 model에 저장

         System.out.println("가격을 입력하세요: "); // 사용자에게 가격을 입력하라고 요청
         String price = scanner.nextLine(); // 입력받은 가격을 변수 price에 저장

         System.out.println("연식 입력하세요: "); // 사용자에게 연식을 입력하라고 요청
         String year = scanner.nextLine(); // 입력받은 연식을 변수 year에 저장

         System.out.println("제조사 입력하세요: "); // 사용자에게 제조사를 입력하라고 요청
         String company = scanner.nextLine(); // 입력받은 제조사를 변수 company에 저장

         String registrationDate = DateUtil.getCurrentDateTime(); // 현재 날짜와 시간을 가져와서 registrationDate에 저장

         Car_model Car_model = new Car_model(model, price, year, company, registrationDate);
         // 입력받은 정보로 Car_model 객체를 생성

         Car_models[userCount] = Car_model; // 배열에 해당 객체를 저장
         userCount++; // 등록된 자동차 수를 하나 증가입력받음

         System.out.println("자동차가 추가 되었습니다: " + model); // 등록 성공 메시지를 출력
      } else {
         System.out.println("더이상 추가 할 수 없습니다"); // 자동차 수가 최대치를 넘으면 메시지를 출력
      }
   }

   // 2. 등록된 자동차 목록 출력
   public static void viewUsers() {
      if (userCount == 0) { // 등록된 자동차가 없다면 / == 0 1대도 등록이 안되었을때 참이됨
         System.out.println("등록된 자동차가 없습니다."); // 해당 메시지를 출력하고
         return; // 메서드를 종료
      }

      System.out.println("등록된 자동차 목록:"); // 목록 제목을 출력
      for (int i = 0; i < userCount; i++) { // 등록된 수만큼 반복해서
         Car_models[i].showInfo(); // 각 자동차 정보를 출력
      }
   }

   // 3. 자동차 수정 기능
   public static void updateUser(Scanner scanner) {
      System.out.println("수정할 자동차의 인데스를 입력하세요 (0 ~ " + (userCount - 1) + "): "); // 수정할 자동차 번호를 입력받음
      int index = scanner.nextInt(); // 입력값을 index에 저장
      scanner.nextLine(); // 줄바꿈 문자 제거

      if (index < 0 || index >= userCount) { // 입력한 번호가 범위를 벗어나면 // 비정상 적인 종료를 막기 위해
         System.out.println("잘못된 인덱스입니다."); // 경고 메시지를 출력하고
         return; // 메서드를 종료 (void 반환 타입일 때 사용, 값을 반환하지 않고 단순히 메서드를 끝)
      }

      System.out.println("수정할 자동차의 모델명을 입력하세요: "); // 새 모델명을 입력받음
      String model = scanner.nextLine(); // model이라는 문자열 변수에 저장

      System.out.println("수정할 자동차의 연식을 입력하세요: "); // 새 연식을 입력받음
      String year = scanner.nextLine(); // year이라는 문자열 변수에 저장

      System.out.println("수정할 자동차의 가격을 입력하세요: "); // 새 가격을 입력받음
      String price = scanner.nextLine(); // " 입력값 저장

      System.out.println("수정할 자동차의 제조사를 입력하세요: "); // 새 제조사를 입력받음
      String company = scanner.nextLine(); // "입력값 저장

      String registrationDate = DateUtil.getCurrentDateTime(); // 현재 시간을 저장
      // Car_model 자동차 정보를 담아 놓은 클래스 , Car_model 객체를 저장하는 변수 이름입니다.
      Car_model Car_model = new Car_model(model, price, year, company, registrationDate); // 새 정보로 자동차 객체(인스턴스)를 생성

      // Car_model Car_model = new Car_model -> [클래스] [변수이름] = new [생성자 호출]
      Car_models[index] = Car_model; // 기존 위치에 새 객체를 덮어씌움

      System.out.println("자동차 정보가 수정되었습니다: " + model); // 완료 메시지를 출력
   }

   // 4. 자동차 삭제 기능
   public static void deleteUser(Scanner scanner) {
      System.out.println("삭제할 자동차의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): "); // 삭제할 번호 요청
      int index = scanner.nextInt(); // 입력값 저장
      scanner.nextLine(); // 줄바꿈 제거

      if (index < 0 || index >= userCount) { // 유효하지 않은 번호면
         System.out.println("잘못된 인덱스입니다."); // 오류 메시지 출력
         return; // 종료
      }

      Car_model Car_model = Car_models[index]; // 삭제할 자동차를 꺼내옴
      System.out.println("삭제할 자동차 정보:"); // 안내 메시지 출력
      Car_model.showInfo(); // 삭제할 자동차 정보 출력

      for (int i = index; i < userCount - 1; i++) { // 뒤의 자동차들을 한 칸씩 앞으로 당김
         Car_models[i] = Car_models[i + 1];
      }

      Car_models[userCount - 1] = null; // 마지막 자리 비움
      userCount--; // 총 자동차 수 하나 줄임

      System.out.println("자동차 삭제되었습니다."); // 완료 메시지 출력
   }

   // 5. 더미(연습용) 자동차 5개 추가하기
   public static void addDummyUsers() {
      for (int i = 0; i < 5; i++) { // 5번 반복해서
         if (userCount < MAX_USERS) { // 최대 등록 수를 넘지 않았으면
            Car_model dummyCar_model = new Car_model( // 더미 자동차 생성
                  "더미자동차" + (i + 1),
                  "가격" + (i + 1),
                  "연도" + (i + 1),
                  "회사" + (i + 1),
                  DateUtil.getCurrentDateTime());

            Car_models[userCount] = dummyCar_model; // 배열에 저장
            userCount++; // 수 증가
         } else {
            System.out.println("더 이상 추가할 수 없습니다."); // 초과 메시지
            break; // 반복 종료
         }
      }
      System.out.println("더미 자동차 5개가 추가되었습니다."); // 완료 메시지
   }

   // 6. 자동차 검색하기 (이름이나 가격으로 찾기)
   public static void searchUser(Scanner scanner) {
      System.out.println("검색할 자동차 모델명 또는 가격을 입력하세요: "); // 검색어 요청
      String searchQuery = scanner.nextLine(); // 검색어 저장
      boolean found = false; // 찾았는지 여부 저장 변수

      for (int i = 0; i < userCount; i++) { // 전체 자동차
         if (Car_models[i].getModel().contains(searchQuery) || // 모델명 포함되거나
               Car_models[i].getPrice().contains(searchQuery)) { // 가격 포함되면
            Car_models[i].showInfo(); // 정보 출력
            found = true; // 찾음 표시
         }
      }

      if (!found) { // 하나도 못 찾았으면
         System.out.println("검색 결과가 없습니다."); // 메시지 출력
      }
   }

   // 전체 메뉴를 보여주는 함수
   public static void ex_user_ui(Scanner scanner) {
      int menu; // 메뉴 번호 저장할 변수
      do {
         System.out.println("자동차 관리 프로그램 예시"); // 프로그램 제목 출력
         System.out.println("================================================");
         System.out.println("1. 자동차 추가");
         System.out.println("2. 자동차 조회");
         System.out.println("3. 자동차 수정");
         System.out.println("4. 자동차 삭제");
         System.out.println("5. 더미 데이터 추가 (5개)");
         System.out.println("6. 자동차 검색");
         System.out.println("0. 종료");
         System.out.println("================================================");
         System.out.print("메뉴를 선택하세요 (0~6): "); // 메뉴 선택 요청

         menu = scanner.nextInt(); // 숫자 입력 받기
         scanner.nextLine(); // 줄바꿈 제거

         switch (menu) { // 입력값에 따라 기능 선택
            case 1:
               addUser(scanner); // 자동차 추가
               break;
            case 2:
               viewUsers(); // 자동차 목록 보기
               break;
            case 3:
               updateUser(scanner); // 수정하기
               break;
            case 4:
               deleteUser(scanner); // 삭제하기
               break;
            case 5:
               addDummyUsers(); // 더미 추가
               break;
            case 6:
               searchUser(scanner); // 검색하기
               break;
            case 0:
               System.out.println("프로그램을 종료합니다."); // 종료 메시지
               break;
            default:
               System.out.println("잘못된 메뉴. 다시 입력해 하세요."); // 잘못된 입력
         }
      } while (menu != 0); // 0 입력 전까지 반복
   }
}
