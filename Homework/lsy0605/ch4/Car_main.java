// 퀴즈
// 폴더 만들기 -homework
// homework 폴더 안에,-> 0605 폴더 ->
// ch4 폴더 -> 기능 클래스 만들기, 실행 클래스 만들기, 모델 클래스 만들기.
// 자동차 관리 프로그램 만들기,
// 자동차 정보 1) 자동차명, 2) 제조사, 3) 연식, 4) 등록일로 구성,
// 메서드 : showInfo() 메서드 만들기,

// 자동차 정보 CRUD , 추가, 조회, 수정, 삭제 기능 , 검색, 더미데이터 추가 구현.
// 최대한 강사 코드 재사용해서 복습하기.

package Homework.lsy0605.ch4; // 이 파일이 속한 폴더(패키지)를 정의

import java.util.Scanner; // 사용자로부터 키보드 입력을 받기 위해 Scanner를 사용

public class Car_main { // 프로그램을 실행하는 메인 클래스

    public static void main(String[] args) { // 프로그램의 시작점인 main 메서드

        Scanner scanner = new Scanner(System.in); // 사용자로부터 입력을 받기 위해 Scanner 객체를 만듬

        Car.ex_user_ui(scanner); // Car 클래스의 자동차 관리 메뉴 화면을 실행

        scanner.close(); // 더 이상 입력을 안 받기 때문에 Scanner를 닫아줌 (메모리 낭비 방지)
    }
} // 프로그램 종료