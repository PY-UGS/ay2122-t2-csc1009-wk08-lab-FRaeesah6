import java.text.DecimalFormat;

public class CheckingAccount {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    private double balance;
    private String accountNumber;

    public CheckingAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return accountNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("$" + df.format(this.balance) + " has been deposited into Account No.:" + this.getNumber());
    }

    public void withdraw(double withdrawalAmount) throws InsufficientFundsException {
        if (withdrawalAmount > balance) {
            throw new InsufficientFundsException(withdrawalAmount - balance);
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("The balance after withdraw is: $" + df.format(this.balance));
        }
    }

}
