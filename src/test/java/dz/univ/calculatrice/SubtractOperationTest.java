package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SubtractOperationTest {
    private final SubtractOperation operation = new SubtractOperation();

    @Test
    void shouldSubtractTwoPositiveNumbers() {
        assertEquals(1.0, operation.execute(4.0, 3.0), 1e-9);
    }

    @Test
    void shouldSubtractNegativeNumbers() {
        assertEquals(1.0, operation.execute(-2.0, -3.0), 1e-9);
        assertEquals(-5.0, operation.execute(-2.0, 3.0), 1e-9);
    }

    @Test
    void shouldSubtractDecimalNumbers() {
        assertEquals(9.5, operation.execute(12.5, 3.0), 1e-9);
        assertEquals(-1.25, operation.execute(1.25, 2.5), 1e-9);
    }

    @Test
    void symbolIsMinus() {
        assertEquals("-", operation.symbol());
    }
}