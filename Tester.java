public class Tester {
    public static void main(String[] args) {
        BankAccount mine = new BankAccount(1134978, "password");

        // Test that information getters work at all
        System.out.println(mine.getBalance()); // 0
        System.out.println(mine.getAccountID()); // 1134978
        System.out.println(mine.toString()); // 1134978\t0.0

        // Test that setPassword doesn't crash
        mine.setPassword("better_password");

        // Test successful cases for deposit and withdraw
        System.out.println(mine.deposit(80.0)); // true
        System.out.println(mine.deposit(0.0)); // true
        System.out.println(mine.toString()); // 1134978\t80.0
        System.out.println(mine.withdraw(40.0)); // true
        System.out.println(mine.withdraw(0.0)); // true
        System.out.println(mine.toString()); // 1134978\t40.0
        System.out.println(mine.withdraw(40.0)); // true
        System.out.println(mine.toString()); // 1134978\t0.0

        // Test invalid cases
        System.out.println(mine.deposit(-20.0)); // false
        System.out.println(mine.getBalance()); // 0.0
        mine.deposit(80.0);
        System.out.println(mine.withdraw(-20.0)); // false
        System.out.println(mine.withdraw(100.0)); // false
        System.out.println(mine.getBalance()); // 80.0
    }
}
