package dz.univ.calculatrice;

public class AddOperation implements Operation {
    @Override
    public double execute(final double first, final double second) {
        return first + second;
    }

    @Override
    public String symbol() {
        return "+";
    }
}