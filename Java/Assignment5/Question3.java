/*
 * Write a program to work with user defined exceptions
 */

 class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance in the account");
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }
}




public class Question3 
{
    public static void main(String[] args) {
        Account account = new Account(1000);

        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
