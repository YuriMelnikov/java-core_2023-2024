package lab2.Bank;

public class BankAccount implements Operations {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    @Override
    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Сумма для внесения депозита должна быть положительной.");
            return;
        }
        balance += amount;
    }
    @Override
    public void withdraw(double amount){
        if (amount < 0){
            System.out.println("Сумма для внесения депозита должна быть положительной.");
            return;
        }
        if (amount > balance){
            System.out.println("Недостаточно средств.");
            return;
        }
        balance -= amount;
    }

    @Override
    public double getBalance(){
        return balance;
    }
}
