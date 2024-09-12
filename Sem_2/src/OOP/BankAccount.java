package OOP;

public class BankAccount {
    private double balance;

    // Конструктор для создания счёта с начальным балансом
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным.");
        }
    }

    // Метод для проверки текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для снятия суммы денег со счёта без комиссии
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount + ". Новый баланс: " + balance);
        } else if (amount > balance) {
            System.out.println("Недостаточно средств на счёте.");
        } else {
            System.out.println("Сумма снятия должна быть положительной.");
        }
    }

    // Метод для пополнения счёта
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнено: " + amount + ". Новый баланс: " + balance);
        } else {
            System.out.println("Сумма пополнения должна быть положительной.");
        }
    }
}
