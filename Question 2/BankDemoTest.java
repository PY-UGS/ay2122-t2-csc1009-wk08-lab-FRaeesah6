import java.text.DecimalFormat;
import java.util.Scanner;

public class BankDemoTest {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            CheckingAccount account = new CheckingAccount(0, "9876543210");
            System.out.print("Please enter Deposit amount: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
            System.out.print("Please enter Withdrawal amount: ");
            double withdrawalAmount = sc.nextDouble();
            account.withdraw(withdrawalAmount);
        }catch(InsufficientFundsException e){
            System.out.println("Sorry but your account is short by: $" + df.format(e.getAmount()));
        }
    }

}