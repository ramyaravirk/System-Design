package structural_desgin_patterns.adapter;

//Adaptee Class (Legacy):
public class LegacyCalulator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int difference(int a, int b) {
        return a - b;
    }

}
