public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    public BankAccount(int accountID, String password) {
        balance = 0;
        this.accountID = accountID;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean deposit(double amount) {
        if(amount >= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if(0 <= amount && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}