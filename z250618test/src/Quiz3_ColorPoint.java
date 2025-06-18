class Point {
    // Point라는 이름의 클래스를 선언
    // 좌표 (x, y) 를 저장하고 조작하기 위한 기본 클래스
    private int x, y;
    // 두 개의 정수형 필드 x와 y를 선언하고, private으로 접근 제한을 둠
    // 외부 클래스에서는 직접 접근 불가하고, 메서드를 통해서만 값에 접근하거나 변경

    public Point(int x, int y) {
        // Point 클래스의 생성자(Constructor)
        // 객체를 생성할 때 외부에서 전달된 x, y 값을 받아서 이 클래스의 필드에 저장
        this.x = x;
        this.y = y;
        // this.x는 클래스 필드, x는 매개변수 → 이름이 같을 때 this로 구분!
        // 예시 )
        // Point p = new Point(3, 5);
        // System.out.println(p.getX());
        // 이 때 getX()는 return x;를 실행해서 3을 돌려줌
        // p.getX()는 3을 반환하고, System.out.println()이 그걸 출력
    }

    public int getX() {
        // x 값을 외부에서 읽을 수 있게 해주는 getter 메서드
        // public으로 선언되어 외부 클래스에서도 호출 가능
        // getX() -> 메서드 이름. x값을 가져온다는 의미
        return x;
        // 메서드에서 x 값을 호출한 쪽으로 돌려줌
    }

    public int getY() {
        // y 값을 외부에서 읽을 수 있게 해주는 getter 메서드
        // public으로 선언되어 외부 클래스에서도 호출 가능
        // getX() -> 메서드 이름. x값을 가져온다는 의미
        return y;
        // 메서드에서 y 값을 호출한 쪽으로 돌려줌
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Quiz3_ColorPoint extends Point {
    // public 어디서는 접근 가능한 클래스 선언 Quiz3_ColorPoint
    // extends Point -> Point 클래스를 상속
    // Quiz3_ColorPoint가 부모 클래스인 Point의
    // 모든 필드(x, y)와 메서드(getX, getY, move 등)를 사용할 수 있음.
    // 즉, Quiz3_ColorPoint는 “좌표 정보 + 색상 정보”를 가지는 확장 클래스
    private String color;
    // private 외부에서 직접 접근 불가.
    // String color 색상을 저장하는 문자열 타입의 필드

    public Quiz3_ColorPoint(int x, int y, String color) {
        // 생성자: 객체를 만들 때 x, y, color 값을 받아서 초기화.
        // 매개변수 int x, int y → 좌표값.
        // String color → 색상 문자열.

        super(x, y);
        // super(x, y); -> 부모 클래스(Point)의 생성자를 호출
        this.color = color;
        // this.color → 현재 객체의 color 필드.
        // color → 생성자의 매개변수.
        // 즉, 전달받은 색상 값을 필드에 저장.
    }

    public void setColor(String color) {
        // 외부에서 호출 가능, 반환값없음,
        // setColor(String color) → 색상 값을 변경할 수 있는 메서드.
        this.color = color;
        // this.color → 현재 객체의 color 필드.
        // color → 생성자의 매개변수.
        // 즉, 전달받은 색상 값을 필드에 저장.
    }

    public void setPoint(int x, int y) {
        // 좌표를 변경하는 메서드.
        // setPoint 외부에서 전달받은 x와 y 값을
        // 현재 객체의 좌표로 설정하는 메서드
        move(x, y);
        // move(x, y)는 부모 클래스(Point)에 정의된 메서드.
        // 현재 객체의 좌표(x, y)를 새 값으로 변경함.
    }

    public void show() {
        // 현재 좌표와 색상을 출력하는 메서드.
        System.out.println(color + "색으로 (" + getX() + ", " + getY() + ")");
        // color → 현재 객체의 색상.
        // getX() / getY() → 부모 클래스(Point)에 정의된 메서드로 x, y값 반환.
        // + 연산자는 문자열을 이어붙임
    }

    public static void main(String[] args) {
        // "args" : 메서드의 매개변수(parameter) 중 하나
        // 자바 실행시 외부에서 문자열을 넘겨줄 수 있도록 만든 거

        // String[] -> 문자열(String) 타입의 배열
        // args → 이 배열의 이름
        // 이름은 자유롭게 바꿀 수 있지만, args가 관례처럼 자주 쓰임
        // args는 외부에서 입력된 문자열 데이터를 배열 형태로 받을 수 있는 변수
        Quiz3_ColorPoint cp = new Quiz3_ColorPoint(5, 5, "YELLOW");
        // 객체 생성 + 참조 변수 선언 및 초기화
        // Quiz3_ColorPoint -> 클래스 이름이자,
        // 만들고 있는 사용자 정의 자료형 (객체 설계도)
        // cp 참조 변수 , 새로 만든 객체를 가리키기 위한 이름

        // new Quiz3_ColorPoint(5, 5, "YELLOW")
        // new 키워드는 새로운 객체를 생성할 때 사용
        // Quiz3_ColorPoint(...)는 생성자(Constructor) 호출
        // (5, 5, "YELLOW")는 생성자에 전달하는 매개변수들

        cp.setPoint(10, 20);
        // cp 객체의 좌표(x, y)를 (10, 20)으로 바꾸는 역할
        // cp: 우리가 만든 객체
        // .setPoint(10, 20): 메서드 호출
        // 내부에서 move(x, y)를 호출해서 부모 클래스 Point의 x, y 값을 변경
        cp.setColor("GREEN");
        // 이 줄은 cp 객체의 색상(color)을 "GREEN"으로 변경하는 역할
        // cp: 우리가 만든 객체
        // .setColor("GREEN"): color 필드 값을 "GREEN"으로 바꿈
        cp.show();
        // 이 줄은 현재 객체의 상태(색상 + 좌표)를 출력하는 메서드

    }
}
