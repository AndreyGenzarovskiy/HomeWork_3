package practice_4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class utilsTest {

    @Test
    void getMaxIndexOfArray() {
        int[] array = {-2, 5, 0, 3, -12, 5, -2, 9, 14, 1, 0, -1};
        int expected = 14;
        int actual = utils.getMaxIndexOfArray(array);
        assertEquals(expected, actual, "The answer is wrong!");
    }

    @Test
    void getLastIndexOfValueInArray() {
        int[] array = {-2, 5, 0, 3, -12, 5, -2, 9, 14, 1, 0, -1};
        int value = 14;
        int expected = 8;
        int actual = utils.getLastIndexOfValueInArray(array, value);
        assertEquals(expected, actual, "Something wrong!");
    }

}