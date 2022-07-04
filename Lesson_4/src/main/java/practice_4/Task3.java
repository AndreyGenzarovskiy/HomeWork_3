package practice_4;
import static practice_4.utils.*;

public class Task3 {
    public static boolean task3(){
        int[] array = initializeArray(4, 10,99);
        printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] >= array[i + 1]){
                return false;
            }
        }
        return true;
    }

}
