package ua.nix.genzarovskiy.hw2;
import org.junit.jupiter.api.Test;
import static ua.nix.genzarovskiy.hw2.NoOfOccurenceOfCharacters.GetOccuringChar;
import static org.junit.jupiter.api.Assertions.*;

class NoOfOccurenceOfCharactersTest {
    @Test
    void getOccuringChar() {
        String str = "hh21w";
        String expected = "h - 2\nw - 1\n";
        String actual = GetOccuringChar(str);
        assertEquals(expected, actual, "Calculated value is wrong");
    }
}