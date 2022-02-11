package ZMyOwnClass.ModyfikatoryDostepu.BankTransfer;

public class Bank implements BankTransfer{

    public final int TRANSFER_FEE = 1;

    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        if (from.getBalance() < amount + TRANSFER_FEE) {
            throw new IllegalStateException("Niewystarczajaca ilosc scrodkow!");
        }
        from.withdraw(amount + TRANSFER_FEE);
        to.deposit(amount);
    }

    public BankAccount openAccount() {
        return new BankAccount();
    }
}
