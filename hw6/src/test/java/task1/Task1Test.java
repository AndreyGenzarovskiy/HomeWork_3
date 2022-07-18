package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void getNumberSquaredTest() {
        int number = 7;
        int expected = 49;
        int actual = Task1.getNumberSquared(number, 2);
        assertEquals(expected, actual, "Numbers square is incorrect!");
    }

    @Test
    void getInversionStringTest() {
        String str = "qwerty";
        String expected = "ytrewq";
        String actual = Task1.getInversionString(str);
        assertEquals(expected, actual, "First and second string does`nt equals!");
    }

}