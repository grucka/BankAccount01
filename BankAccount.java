import java.util.Random;

public class BankAccount{
    
    private double checkingBalance;
    private double savingBalance;
    public static int numOfAccounts = 0;
    public static double totalAmount = 0;

    private final String accountNumber;

    public BankAccount(double checkingBalance, double savingBalance) {
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        this.accountNumber = RandomAccountNumber();
        numOfAccounts++;
        totalAmount += checkingBalance + savingBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(String accountType, double amount) {
        if (accountType.equals("checking")) {
            checkingBalance += amount;
            totalAmount += amount;
        } else if (accountType.equals("saving")) {
            savingBalance += amount;
            totalAmount += amount;
        }
    }

    public void withdraw(String accountType, double amount) {

        if (accountType.equals("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalAmount -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }
        if (accountType.equals("saving")) {
            if (savingBalance >= amount) {
                savingBalance -= amount;
                totalAmount -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }

    public double totalBalance() {
        return checkingBalance + savingBalance;
    }

    public String RandomAccountNumber() {
        Random rand = new Random();
        StringBuilder accBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int digit = rand.nextInt(10);
            accBuilder.append(digit);
        }
        return accBuilder.toString();
    }

}