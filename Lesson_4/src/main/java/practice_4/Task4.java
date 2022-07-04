package practice_4;
import static practice_4.utils.*;
import static practice_4.AvarageOfArray.*;

public class Task4 {
    public static void task4(){
        int[] array1 = initializeArray(5, 0,5);
        int[] array2 = initializeArray(5,0,5);
        printArray(array1);
        printArray(array2);
        System.out.println("Avarage of 1st array is: " + getAvarageOfArray(array1));
        System.out.println("Avarage of 2nd array is: " + getAvarageOfArray(array2));
        System.out.println(getEqualsAvarages(getAvarageOfArray(array1), getAvarageOfArray(array2)));
    }
}
