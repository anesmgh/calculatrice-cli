package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddOperationTest {
    private final AddOperation op = new AddOperation();

    @Test
    void addsPositiveNumbers() {
        assertEquals(5.0, op.apply(2, 3), 1e-9);
    }

    @Test
    void addsNegativeNumbers() {
        assertEquals(-5.0, op.apply(-2, -3), 1e-9);
        assertEquals(1.0, op.apply(-2, 3), 1e-9);
    }

    @Test
    void addsDecimals() {
        assertEquals(15.5, op.apply(12.5, 3), 1e-9);
    }

    @Test
    void symbolIsPlus() {
        assertEquals("+", op.symbol());
    }
}