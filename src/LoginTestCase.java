public class LoginTestCase {
    public static void main(String[] args) {
        String expected = "Login successful";
        String actual = "Login successful";

        if (expected.equals(actual)) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Тест не пройдено");
        }
    }
}
