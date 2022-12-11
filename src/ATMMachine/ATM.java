package ATMMachine;

public class ATM {
    public static void main (String[] args) {
        CashMachine cm = new CashMachine();

        cm.addMoney(30, 10, 30);
        cm.askMoney(50);

    }
}
