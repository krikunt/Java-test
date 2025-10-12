package task7;

public final class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, boolean available,double discount) {
        super(name, price, available);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        double discountedPrice = getPrice() - (getPrice() * discount / 100);
        return  discountedPrice;
        }

        @Override
    public void printProductInfo() {
        System.out.println("Назва товару: " + getName());
        System.out.println("Ціна без знижки: " + getPrice() + "грн");
        System.out.println("Знижка: " + discount + "%");
        System.out.println("Ціна зі знижкою: " + getDiscountedPrice() + "грн");
        System.out.println("Наявність: " + (isAvailable() ? "є в наявності" : "немає в наявності"));
    }
}
