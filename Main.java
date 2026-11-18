import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean l = false;
        int sum = 0;
        while (sum < 3) {
            System.out.println("enter a 4 digit PIN");
            int p = scan.nextInt();
            if (p == 1234) {
                l = true;
                break;
            } else {
                sum++;
                System.out.println("PIN Eror ");
            }
        }
        if (l == false) {
            System.out.println("your account has been locked");
        } else {
            double balance = 2500.75;
            System.out.println("enter num");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.println(balance);
                    break;
                case 2:
                    System.out.println("enter deposit amount ");
                    int deposit = scan.nextInt();
                    if (deposit <= 0) {
                        System.out.println("invalid amount");
                    } else {
                        balance += deposit;
                        System.out.println("your balance is now :"+ balance);
                    }
                    break;
                case 3:
                    System.out.println("enter amount ");
                    int amount = scan.nextInt();
                    if (amount > balance) {
                        System.out.println("insuffficient balance");
                    } else if (amount <= 0) {
                        System.out.println("invalid amount");
                    } else {
                        balance -= amount;
                        System.out.println("your balance is now :"+ balance);
                    }
                    break;
                case 4:
                    if (balance >= 5000) {
                        System.out.println("VIP Customer");
                    } else if (balance <= 4999.9 && balance >= 1000) {
                        System.out.println("reguler customer ");
                    } else if (balance < 1000) {
                        System.out.println("low balance");
                    }
                    break;
                case 5:
                    System.out.println("thank you for using our ATM");
                    break;
                default:
                    System.out.println("Invalid Option");

            }
        }
    }
}

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

