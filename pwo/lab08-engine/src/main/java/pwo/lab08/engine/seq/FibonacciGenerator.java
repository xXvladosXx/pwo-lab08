package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa odpowiadająca za generowanie wyrazów ciągu Fibonacciego.
 *
 * @author pidoras
 */
public class FibonacciGenerator extends Generator {

    /**
     * The class constructor that assigns the variables for the Fibonacci string
     * initial values.
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    @Override
    public void reset() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;

        return current;
    }
}
