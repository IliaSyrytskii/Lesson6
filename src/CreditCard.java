import java.util.Scanner;

public class CreditCard {
    Scanner sc = new Scanner(System.in);
    int money;

        int accountNumber;
        int balance;


        public CreditCard(int accountNumber, int balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void plus() {
            System.out.println("Enter summ of accrual");
            money = sc.nextInt();
            this.balance += money;
        }
        public void minus() {
            System.out.println("Enter summ of removal");
            money = sc.nextInt();
            this.balance -= money;
        }
        public void condition() {
            System.out.println("Account:  " + this.accountNumber + " Balance:  " + this.balance);
        }

        public static void main(String[] args) {
            CreditCard alfa = new CreditCard(1060, 1500);
            CreditCard belarus = new CreditCard(990, 1300);
            CreditCard prior = new CreditCard(1100, 600);

            alfa.plus(); prior.plus(); belarus.minus();
            alfa.condition(); belarus.condition(); prior.condition();




        }
    }


