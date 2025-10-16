package task8;

import task7.Product;

import java.util.ArrayList;

public class ProductManager {
    public static void main (String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Телефон", 20000, true));
        products.add(new Product("Телефон", 50000, true));
        products.add(new Product("Навушники", 4000, false));

        for (Product product : products) {
            System.out.println("Назва: " + product.getName() + ", Ціна: " + product.getPrice() + ", Наявність: " + (product.isAvailable() ? "є в наявності" : "немає в наявності"));
        }
    }
}
