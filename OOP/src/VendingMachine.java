import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    List<Product> productList;
    Integer money;

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.name.equals(name)) {
                money += product.price;
                return product;
            }
        }
        return null;
    }
    List<Product> initProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Soda", 25));
        products.add(new Product("Chips", 15));
        products.add(new Product("Chocolate", 20));
        return products;
    }
}

