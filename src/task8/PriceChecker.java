package task8;

public class PriceChecker {

    static class InvalidPriceExeption extends Exception {
        public InvalidPriceExeption(String message) {
            super(message);
        }
    }

    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void validatePrice() throws InvalidPriceExeption {
            if (price <= 0) {
                throw new InvalidPriceExeption("Помилка: ціна продукту має бути більшою за 0. Поточна ціна: " + price);
            } else  {
                System.out.println("Ціна продукту \"" + name + "\" коректна: " +price);
            }
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Телефон", 20000);
        Product p2 = new Product("Навушники", -200);

        try {
            p1.validatePrice();
        } catch (InvalidPriceExeption e) {
            System.out.println(e.getMessage());
        }

        try {
            p2.validatePrice();
        } catch (InvalidPriceExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
