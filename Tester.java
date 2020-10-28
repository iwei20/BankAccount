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

        BankAccount b1 = new BankAccount(1000001, "abc123");
        BankAccount b2 = new BankAccount(1000231, "abcasdg23");
  
        System.out.println("Account b1:");
        b1.deposit(3000.0);
        b2.deposit(1234.0);
        System.out.println(b1);
        System.out.println("Account b2:");
        System.out.println(b2);
        System.out.println();
  
  
        double cashAmount = 300.0;
        while(cashAmount < 3000){
            System.out.println("Attempt to move $"+cashAmount+" from the b1 to b2 account:");
            if(b1.withdraw(cashAmount) ){
                if(b2.deposit(cashAmount)){
                    System.out.println(b1);
                    System.out.println(b2);
                    System.out.println();
                }else{
                    //This should never happen.
                    //Error message provided to make sure that is the case
                    System.out.println("CRITICAL ERROR! $"+cashAmount + 
                                 " withdrawn from Account #" +  b1.getAccountID() + 
                                 "Failed to add to Account #"+b2.getAccountID());
                }
            }else{
                System.out.println("Transfer Failed");
            }
  
            cashAmount *= 2;
        }
    }
}
