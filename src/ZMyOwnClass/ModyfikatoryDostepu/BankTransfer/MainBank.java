package ZMyOwnClass.ModyfikatoryDostepu.BankTransfer;

public class MainBank {
    public static void main(String[] args) {

        Bank bank = new Bank();
        BankAccount account1 = bank.openAccount();
        BankAccount account2 = bank.openAccount();

        account1.deposit(100);
        account2.deposit(50);

        bank.transfer(account1, account2, 65);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        bank.transfer(account1, account2, 33);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

    }
}
