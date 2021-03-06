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

    public String toString() {
        return "#" + accountID + "\t$" + balance;
    }

    private boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public boolean transferTo(BankAccount other, double amount, String password) {
        if(authenticate(password) && other.withdraw(amount)) {
            return other.deposit(amount);
        }
        return false;
    }
}