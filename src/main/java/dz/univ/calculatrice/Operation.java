package dz.univ.calculatrice;

public interface Operation {
    double apply(double a, double b);

    String symbol();
}