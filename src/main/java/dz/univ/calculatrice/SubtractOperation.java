package dz.univ.calculatrice;

public class SubtractOperation implements Operation {
    @Override
    public double execute(final double first, final double second) {
        return first - second;
    }

    @Override
    public String symbol() {
        return "-";
    }
}