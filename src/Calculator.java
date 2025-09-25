public class Calculator {
    public int add(int a,int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(5, 7);
        System.out.println(result);
    }
}
