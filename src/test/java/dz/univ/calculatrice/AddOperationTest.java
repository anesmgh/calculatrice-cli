package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddOperationTest {
    private final AddOperation operation = new AddOperation();

    @Test
    void shouldAddTwoPositiveNumbers() {
        assertEquals(7.0, operation.execute(3.0, 4.0), 1e-9);
    }

    @Test
    void shouldAddNegativeAndPositiveNumbers() {
        assertEquals(1.0, operation.execute(-2.0, 3.0), 1e-9);
    }

    @Test
    void shouldAddTwoNegativeNumbers() {
        assertEquals(-5.0, operation.execute(-2.0, -3.0), 1e-9);
    }

    @Test
    void shouldAddDecimalNumbers() {
        assertEquals(3.75, operation.execute(1.25, 2.5), 1e-9);
        assertEquals(15.5, operation.execute(12.5, 3.0), 1e-9);
    }

    @Test
    void symbolIsPlus() {
        assertEquals("+", operation.symbol());
    }
}