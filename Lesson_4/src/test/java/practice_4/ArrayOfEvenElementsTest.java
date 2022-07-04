package practice_4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfEvenElementsTest {

    @Test
    void getArrayOfEvenElements() {
        int[] array = {1, 4, 5, 3, 4, 7, 8, 3};
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 4, 8));
        ArrayList<Integer> actual = ArrayOfEvenElements.getArrayOfEvenElements(array);
        assertEquals(expected, actual, "Something is wrong!");




    }
}