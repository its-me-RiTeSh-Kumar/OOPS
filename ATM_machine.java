import java.util.*;

class ATM {
    float Balance = 0;
    int pin = 1234;

    public void checkpin() {
        System.out.println("Enter the pin ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Enter a Valid pin");
        }
    }

    public void menu() {
        System.out.println("Enter Your Choices:");
        System.out.println(" 1. Check A/C Balance ");
        System.out.println("2. Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.end");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance();

        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance:" + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficent Balance !!!");

        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawn Sucessful ");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        Float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited sucessfully");
        menu();
    }

}

public class ATM_machine {
    public static void main(String args[]) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
