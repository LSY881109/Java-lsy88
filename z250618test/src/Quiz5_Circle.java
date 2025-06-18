import java.util.Scanner;

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class Quiz5_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] circles = new Circle[4];

        for (int i = 0; i < circles.length; i++) {
            System.out.print((i + 1) + " 반지름 >> ");
            int r = scanner.nextInt();
            circles[i] = new Circle(r);
        }

        System.out.println("저장하였습니다...");

        double totalArea = 0;
        for (Circle c : circles) {
            totalArea += c.getArea();
        }

        System.out.printf("원의 면적 전체 합은 %.2f\n", totalArea);

        scanner.close();
    }
}
