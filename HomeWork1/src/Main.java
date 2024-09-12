import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("Чай", 50.0, 80));
        products.add(new HotDrink("Кофе", 70.0, 90));
        products.add(new HotDrink("Горячий шоколад", 60.0, 85));

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(products);

        try {
            HotDrink drink1 = vendingMachine.getProduct("Кофе", git90); // Ищем напиток по температуре
            System.out.println(drink1);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            HotDrink drink2 = vendingMachine.getProduct("Чай", 80);
            System.out.println(drink2);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            HotDrink drink3 = vendingMachine.getProduct("Горячий шоколад", 70); // Этот напиток не существует
            System.out.println(drink3);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
