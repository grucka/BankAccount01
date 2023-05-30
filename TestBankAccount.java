public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount b = new BankAccount(25, 20);
        System.out.println("Account Number a: " + b.getAccountNumber());

        BankAccount a = new BankAccount(2, 2);
        System.out.println("Account Number b: " + a.getAccountNumber());

        b.deposit("checking", 5);
        b.deposit("saving", 10);

        a.deposit("checking", 2);
        a.deposit("saving", 2);

        System.out.println(b.getCheckingBalance());
        System.out.println(b.getSavingBalance());

        b.withdraw("checking", 10);
        b.withdraw("saving", 5);

        System.out.println(a.getCheckingBalance());
        System.out.println(a.getSavingBalance());

        System.out.println(a.totalBalance());
        System.out.println(b.totalBalance());

        System.out.println("Total Amount is: " + BankAccount.totalAmount);
        System.out.println("Number Of Total Account Created is: " + BankAccount.numOfAccounts);
    }

    @Override
    public String toString() {
        return "TestBankAccount []";
    }

}