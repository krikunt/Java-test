public class DivisionExample {

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("На нуль ділити не можна");
        }
    }

    public static void main(String[] args) {
        divide(20, 5);
        divide(20, 0);
    }
}
