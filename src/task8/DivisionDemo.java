package task8;

public class DivisionDemo {

    public static double divide(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Помилка: ділення на нуль неможливе");
        } finally {
            System.out.println("Операція завершена");
        }
        return result;
    }
    public static void main(String[] args) {
        double x = 10;
        double y = 0;

        double result = divide(x, y);
        System.out.println("Результат: " + result);

        double result2 = divide(20, 5);
        System.out.println("результат: " + result2);
    }
}
