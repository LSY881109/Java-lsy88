package d250609.ch5;

public class Animal_Ex1 { // 부모 클래스
    protected String name;

    public void speak() {
        System.out.println("동물 소리를 냅니다.");
    }

    // 화면에 안보이지만, 기본 생성자 생략이 된 상태.

    // 매개변수가 있는 생성자를 만들 경우에는 , 기본 생성자를 더이상 지원을 안해줌.
    public Animal_Ex1() {
    }

    // 매개변수가 1개인 생성자.
    public Animal_Ex1(String name) {
        this.name = name;
    }

}