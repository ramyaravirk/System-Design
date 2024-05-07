package structural_desgin_patterns.adapter;

//Adapter Class:

public class LegacyCalculatorAdapter implements Target{

    private LegacyCalulator legacyCalculator = new LegacyCalulator();


    @Override
    public int add(int a, int b) {
        return legacyCalculator.sum(a,b);
    }

    @Override
    public int subtract(int a, int b) {
        return legacyCalculator.difference(a,b);
    }
}
