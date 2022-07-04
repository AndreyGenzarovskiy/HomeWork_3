package practice_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvarageOfArrayTest {

    @Test
    void getAvarageOfArray() {
        int[] array = {4, 0, 1, 4, 3};
        float expected = 2.4f;
        float actual = AvarageOfArray.getAvarageOfArray(array);
        assertEquals(expected, actual, "Avarage of array is wrong!");

    }

    @Test
    void getEqualsAvarages() {
        float avarage1stArray = 2.4f, avarage2ndArray = 2.6f;
        String expected = "Second arrays avarage is bigger";
        String actual = AvarageOfArray.getEqualsAvarages(avarage1stArray, avarage2ndArray);
        assertEquals(expected, actual, "The answer is incorrect!");
    }
}