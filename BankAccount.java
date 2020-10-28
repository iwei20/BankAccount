public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    public BankAccount(int accountID, String password) {
        balance = 0;
        this.accountID = accountID;
        this.password = password;
    }

    public int getAccountID() {
        return accountID;
    }
}