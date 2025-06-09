public class MemberMainEx3 {
    public static void main(String[] args) {
        MemberEx3 member1 = new MemberEx3("김지연1", "kim8@naver.com", "1234");
        MemberEx3 member2 = new MemberEx3("김지연2", "kim11@naver.com", "0000");
        MemberEx3 member3 = new MemberEx3("김지연3", "kim44@naver.com", "0001");

        // 방금 만든 설계 클래스를 담을 배열 생성하기.
        // MemberEx3Quiz[] memberArray = new MemberEx3Quiz[3];
        MemberEx3[] memberArray = { member1, member2, member3 };

        // 반복문으로 담기
        // for (int i = 0; i < memberArray.length; i++) {
        // memberArray[i] = MemberTempArray[i];
        // }

        System.out.println("===============인스턴스 기본 생성 후 , 확인 해보기 ============================");
        // 각 인스턴스를 , 반복문 이용해서 출력 해보기.
        for (MemberEx3 member : memberArray) {
            member.showInfo();
        }
        System.out.println("===============수정 후 , 확인 해보기 ============================");
        member1.changeNameEmailPassword("김지연4", "kim@naver.com", "4567");
        member2.changeNameEmailPassword("김지연5", "kim2@naver.com", "9789");
        member3.changeNameEmailPassword("김지연6", "kim3@naver.com", "7531");

        // member1.showInfo();
        // member2.showInfo();
        // member3.showInfo();

        for (MemberEx3 member : memberArray) {
            member.showInfo();
        }
    }
}
