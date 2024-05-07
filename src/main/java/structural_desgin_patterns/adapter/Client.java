package structural_desgin_patterns.adapter;

public class Client {
    public static void main(String[] args) {
        Target calculator = new LegacyCalculatorAdapter();
        int result1 = calculator.add(5, 3);
        int result2 = calculator.subtract(10, 2);
        System.out.println("5 + 3 = " + result1);
        System.out.println("10 - 2 = " + result2);
    }
}
