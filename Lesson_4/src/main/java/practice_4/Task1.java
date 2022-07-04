package practice_4;
import static practice_4.utils.*;
public class Task1 {
    public static void task1(){
        int[] array = initializeArray(12, -15, 15);
        printArray(array);
        int max = getMaxIndexOfArray(array);
        System.out.printf("%d\t", max);
        System.out.printf("[%d]", getLastIndexOfValueInArray(array, max));
    }
}
