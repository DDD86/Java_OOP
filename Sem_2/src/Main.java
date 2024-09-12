import OOP.Square;
import OOP.BankAccount;

import java.io.File;
import java.io.IOException;

public class Main {
    static int n = 5;

    public static void main(String[] args) throws IOException {
         //todo hello world
        System.out.println(n);
        task1();
        Square square = new Square(40);
        System.out.println(square.getSquare());
        BankAccount myAccount = new BankAccount(1000);

        // Проверка текущего баланса
        System.out.println("Текущий баланс: " + myAccount.getBalance());

        // Пополнение счёта на 500
        myAccount.deposit(500);

        // Снятие 300
        myAccount.withdraw(300);

        // Попытка снять сумму, превышающую баланс
        myAccount.withdraw(1500);
    }

    public static void task1() {
        n += 4;
        System.out.println(n);
    }
}