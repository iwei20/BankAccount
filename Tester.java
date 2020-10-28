public class Tester {
    public static void main(String[] args) {
        BankAccount mine = new BankAccount(1134978, "password");

        // Test that information getters work at all
        System.out.println(mine.getBalance()); // 0
        System.out.println(mine.getAccountID()); // 1134978
        System.out.println(mine.toString()); // 1134978\t0.0

        // Test that setPassword doesn't crash
        mine.setPassword("better_password");
    }
}
