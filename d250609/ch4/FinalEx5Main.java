public class FinalEx5Main {

    public static void main(String[] args) {
        FinalEx5 finalEx5 = new FinalEx5();
        finalEx5.circleMethod(10);
        // final 로 정의한, 공유 산수 변경 시도 > 변경이 불가능
        // FinalEx5.PI = 3.14;

    }
}
