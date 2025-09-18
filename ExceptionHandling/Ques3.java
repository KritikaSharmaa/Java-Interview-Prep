package ExceptionHandling;

// Q Create a custom exception InsufficientBalanceException.
// A BankAccount class should have a withdraw(int amount) method.
// If balance < amount, throw your custom exception.
// Demonstrate it in main().

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount{
    int balance;

    BankAccount(int balance){
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Attempting to withdraw 2000...");
        try {
              account.withdraw(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
