// 퀴즈1-1
// 설계 클래스 만들기, 클래스명 : Member
// 멤버 변수 : 1) name 2) email 3) password , private 지정,
// 생성자 만들기
// getter, setter 만들기. 하나씩 조회 및, 수정,
// 조회는 : showInfo , 각 멤버 정보 호출하는 기능,
// 수정 : changeNameEmailPassword : 메서드 이름으로 만들기.
// 실행 후,
// 1) 각 인스턴스 생성 3개 해보기 2) 각 인스턴스로 정보 출력, 3) 정보 변경 해보기.

public class MemberEx3 {

    private String name;
    private String email;
    private String password;

    public MemberEx3(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
    }

    public String getName() {
        return this.name; // 현재 인스턴스에 설정이 된 이름.
    }

    public String getEmail() {
        return this.email; // 현재 인스턴스에 설정이 된 이름.
    }

    public String getPassword() {
        return this.password; // 현재 인스턴스에 설정이 된 이름.
    }

    // 외부에서, 변경을 하는 경우, Setter 사용함.

    // 자동으로 코드를 생성해줌. 일단, 수동으로 확인.
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changeNameEmailPassword(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

}