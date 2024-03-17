package lab2.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);
        System.out.println("Начальный баланс: " + bankAccount.getBalance());

        bankAccount.deposit(1000);
        System.out.println("После внесения депозита: " + bankAccount.getBalance());

        bankAccount.withdraw(300);
        System.out.println("После снятия: " + bankAccount.getBalance());
    }
}
