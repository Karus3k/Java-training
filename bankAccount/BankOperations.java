package bankAccount;

public class BankOperations {
    private double balance;
    public void bankInterface(){
        this.balance = 0.0;
    }
    public void  deposit(double amount) {
        this.balance+=amount;
    }
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Error: Insufficient funds.");
        } else {
            this.balance -= amount;
        }
    }
    public double getBalance() {
        return this.balance;

    }
}
