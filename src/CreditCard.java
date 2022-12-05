import java.util.Scanner;



public class CreditCard {
    private Scanner sc = new Scanner(System.in);
    private int money;

    class Description {

        int accountNumber;
        int balance;


        public  Description(int accountNumber, int balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void plus() {
            balance += money;
        }

        public void minus() {
            balance -= money;
        }

        public void condition() {
            System.out.println();
        }
    }
        public void main(String[] args) {
        Description alfa = new Description(1060, 1500);
        Description belarus = new Description(990, 1300);
        Description prior = new Description(1100, 600);
            System.out.println("Enter card");


            //добавляем
            System.out.println("Enter summ of accrual");
            money = sc.nextInt();
            alfa.plus();
            //изъятие
            System.out.println("Enter summ of removal");
            money = sc.nextInt();
            alfa.minus();
            //состояние
            alfa.condition();



        }
    }


