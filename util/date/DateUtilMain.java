package util.date;

public class DateUtilMain {
    public static void main(String[] args) {
        System.out.println("현재 시간을 불러오는 기능 확인.");
        String currentTime = DateUtil.getCurrentDateTime();
        System.out.println("현재 시간: " + currentTime);
    }

    // 퀴즈,
    // user_mini_project -> MainClass.java 파일에
    // 회원 가입 항목에, 현재 가입 시간을 추가하고, 출력도 해보기.
    // DateUtil.getCurrentDateTime() 메서드를 이용해서, 현재 시간을 불러와서 출력해보기.
}