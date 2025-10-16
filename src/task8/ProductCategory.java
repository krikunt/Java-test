package task8;

import java.util.HashSet;

public class ProductCategory {
    public static void main(String[] args) {
        HashSet<String> categories = new HashSet<>();

        categories.add("Електроніка");
        categories.add("Одяг");
        categories.add("Побутова техніка");
        categories.add("Косметика");
        categories.add("Одяг");

        System.out.println("Унікальні категорії товарів");
        for (String category : categories) {
            System.out.println(category);
        }

        String checkCategory = "Електроніка";
        if (categories.contains(checkCategory)) {
            System.out.println(checkCategory + " є в наборі категорій.");
        } else {
            System.out.println(checkCategory + " немає в наборі категорій.");
        }
    }
}
