package practice_4;
import static practice_4.utils.*;

public class Task2 {
    public static void task2() {
        int[] array = initializeArray(8, 1, 10);
        printArray(array);
        changeEvenIndexedElementToZero(array);
        printArray(array);
    }
}
