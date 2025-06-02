package util.date;

import java.time.LocalDateTime; // LocalDateTime : 날짜와 시간을 다루는 클래스
import java.time.format.DateTimeFormatter; //DateTimeFormatter 

public class DateUtil {
    // 정적 메서드 추가, 현재 날짜와 시간
    // 형식을 2025년 05월 30일 오후 4시 35분 , 이런 형식의 데이터를
    // 문자열 형태로 반환 하는 메소드 만들기
    public static String getCurrentDateTime() {
        // 현재 날짜를 알려주는 클래스 : LocalDateTime 이용하기.
        // [클래스명] [변수명] = [클래스명].[정적 메서드]();
        LocalDateTime now = LocalDateTime.now(); // 현재 날짜와 시간 가져오기

        // 사용자가 정의한 포맷 모양으로 변환하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 mm월 dd일 a h시 m분");
        // 반환하기
        return now.format(formatter); // 포맷을 적용하여 문자열로 변환하여 반환
        // 방법2) 인스턴스 형태로, 객체를 생성해서, 메서드 호출하기.
        // [클래스명] [변수명] = new [클래스명]();

    }
}
