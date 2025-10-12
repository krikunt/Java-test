package task7;

public class Store {
    public static void main(String[] args) {
        Product phone = new Product("Телефон", 20000.0, true);
        Product laptop = new Product("Ноутбук", 50000.0, false);

        System.out.println("Товари без знижки");
        phone.printProductInfo();
        laptop.printProductInfo();

       DiscountedProduct DiscPhone = new DiscountedProduct("Телефон", 20000.0, true, 15.0);
        DiscountedProduct DiscLaptop = new DiscountedProduct("Ноутбук", 50000.0, false, 15.0);

        System.out.println("\nТовари зі знижкою");
        DiscPhone.printProductInfo();
        DiscLaptop.printProductInfo();
    }
}
