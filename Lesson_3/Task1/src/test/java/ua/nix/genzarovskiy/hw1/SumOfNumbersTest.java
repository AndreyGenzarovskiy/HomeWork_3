package ua.nix.genzarovskiy.hw1;
import org.junit.jupiter.api.Test;
import static ua.nix.genzarovskiy.hw1.SumOfNumbers.GetSumOfNumbers;
import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {
    @Test
    void getSumOfNumbers() {
        String enteredString = "abc123";
        int expected = 6;
        int actual = GetSumOfNumbers(enteredString);
        assertEquals(expected, actual, "Calculated value is wrong");
    }
}