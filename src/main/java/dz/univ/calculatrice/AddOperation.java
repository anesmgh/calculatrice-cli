package dz.univ.calculatrice;

public class AddOperation implements Operation {
    @Override
    public double apply(final double a, final double b) {
        return a + b;
    }

    @Override
    public String symbol() {
        return "+";
    }
}