import java.util.ArrayList;
public class cityList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Київ");
        cities.add("Харків");
        cities.add("Одеса");

        System.out.println(cities);

        cities.add("Полтава");

        System.out.println(cities);

        cities.remove(0);

        System.out.println(cities);
    }
}
