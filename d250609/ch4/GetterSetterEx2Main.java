public class GetterSetterEx2Main {
    public static void main(String[] args) {
        GetterSetterEx2 getterSetterEx = new GetterSetterEx2("김개똥", "lsy@naver.com", "1234");
        // public, 외부에서 직접 데이터 접근
        // 직접 접근 수정

        // getterSetterEx.name = "직접 접근해서 이름 수정 김길동"; // 직접 접근 임의 수정
        // // private , 데이터 직접 접근을 막는다.
        // getterSetterEx.email = "lsy@naver.com 수정";
        // getterSetterEx.password = "password 수정";
        getterSetterEx.showInfo();

        System.out.println("Getter 라는 메서드를 이용, 각 멤버 변수 하나 조회 확인");
        System.out.println("이름 조회 : " + getterSetterEx.getNmae());
        System.out.println("이메일 조회 : " + getterSetterEx.getEmail());
        System.out.println("패스워드 조회 : " + getterSetterEx.getPassword());
        System.out.println("Setter 라는 메서드를 이용해서, 각 멤버 변수 값 설정 확인");
        getterSetterEx.setName("이길동 setter로 수정");
        getterSetterEx.setEmail("lsy@naver.com  setter로 수정");
        getterSetterEx.setPassword("123456  setter로 수정");
        System.out.println("Setter를 이용해서, 데이터를 변경하고, 값 확인");
        getterSetterEx.showInfo();
    }

}
