package ATMMachine;

public class CashMachine {
    private static int x20;
    private static int x50;
    private static int x100;

    public static void addMoney(int add20, int add50, int add100) {
        add20 += x20;
        add50 += x50;
        add100 += x100;
    }
    static void askMoney(int requestCash) {
        if (requestCash % 10 != 0) {
            System.out.println("Wrong sum");
        }else {
            boolean firstAnswer;
            if (x100 * 100 + x50 * 50 + x20 * 20 >= requestCash) {
                firstAnswer = true;
            }else {
                firstAnswer = false;
                System.out.println("Not enough money");
            }
        }
    }


}
