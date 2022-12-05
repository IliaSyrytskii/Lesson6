import java.util.Scanner;



public class CreditCard {
    static int accountNumber;
    static int balance;

    void PriorBank () {
        accountNumber = 1067;
        balance = 1805;
    }

    void BelarusBank () {
        accountNumber = 1198;
        balance = 1250;
    }
    void AlfaBank () {
        accountNumber = 1325;
        balance = 1500;
    }
    private int money;
    private Scanner sc = new Scanner(System.in);

    public void main(String[] args) {


        //добавляем
        System.out.println("Enter summ of accrual");
        money = sc.nextInt();
        plus();
        //изъятие
        System.out.println("Enter summ of removal");
        money = sc.nextInt();
        minus();
        //состояние
        condition();

    }
    public void plus () {
        balance += money;
    }
    public void minus() {
        balance -= money;
    }
    public void condition() {
        System.out.println();
    }
}


