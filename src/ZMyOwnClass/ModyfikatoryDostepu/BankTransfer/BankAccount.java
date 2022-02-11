package ZMyOwnClass.ModyfikatoryDostepu.BankTransfer;

public class BankAccount implements Account{

    private int balance;

    BankAccount(){
        this(0);
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("ammount must be > 0");
        }
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("ammount must be > 0");
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

}
