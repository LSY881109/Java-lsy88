public class BankAccountEx6Main {

    public static void showInfo() {
        System.out.println("현재 총 계좌 건수: " + BankAccountEx6.accountCount);
        System.out.println("현재 이자율: " + BankAccountEx6.INTEREST_RATE);
    }

    public static void main(String[] args) {
        BankAccountEx6 bankAccountEx6 = new BankAccountEx6("김김김");
        BankAccountEx6 bankAccountEx6_2 = new BankAccountEx6("김김김2");
        BankAccountEx6 bankAccountEx6_3 = new BankAccountEx6("김김김3");

        BankAccountEx6.showInfo();
    }
}
