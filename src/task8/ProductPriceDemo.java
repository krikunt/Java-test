package task8;

import java.util.HashMap;
import java.util.Map;

public class ProductPriceDemo {
    public static void main(String[] args) {
        HashMap<String, Double> productPrices = new HashMap<>();

        productPrices.put("Телефон", 20000.0);
        productPrices.put("Ноутбук", 50000.0);
        productPrices.put("Навушники", 4000.0);

        System.out.println("Продукти та їх ціни");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println("Продукт: " +entry.getKey() + ", Ціна: " + entry.getValue());
        }
    }
}
