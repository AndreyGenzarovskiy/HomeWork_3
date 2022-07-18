package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveMultiplicationTest {

    @Test
    void multiplicationOneOfNumbersIsZero() {
        int n = 4;
        int m = 0;
        int expected = 0;
        int actual = RecursiveMultiplication.multiplication(n, m);
        assertEquals(expected, actual, "multiplication by 0 should return 0!");
    }

    @Test
    void multiplicationFirstOfNumbersIsOne() {
        int n = 1;
        int m = 4;
        int expected = 4;
        int actual = RecursiveMultiplication.multiplication(n, m);
        assertEquals(expected, actual, "multiplication by 1 should give the value of the second multiplier!");
    }

    @Test
    void multiplicationSecondOfNumbersIsOne() {
        int n = 4;
        int m = 1;
        int expected = 4;
        int actual = RecursiveMultiplication.multiplication(n, m);
        assertEquals(expected, actual, "multiplication by 1 should give the value of the first multiplier!");
    }

    @Test
    void multiplicationTest() {
        int n = 4;
        int m = 7;
        int expected = 28;
        int actual = RecursiveMultiplication.multiplication(n, m);
        assertEquals(expected, actual, "product of numbers is not correct");
    }

    @Test
    void productOfNumbers() {
        int n = -3;
        int m = 8;
        int expected = -24;
        int actual = RecursiveMultiplication.productOfNumbers(n, m);
        assertEquals(expected, actual);
    }
}