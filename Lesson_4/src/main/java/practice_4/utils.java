package practice_4;
import java.util.Random;

final public class utils {

    public static int[] initializeArray(int size, int leftBoarder, int rightBoarder) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rightBoarder - leftBoarder) + leftBoarder;
        }
        return array;
    }

    public static int getMaxIndexOfArray(int[] array) {
        int max = array[0];
        for (var element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public static int getLastIndexOfValueInArray(int[] array, int value) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -array.length;
    }

    public static void printArray(int[] array) {
        for (int element:array) {
            System.out.printf("%4d", element);
        }
        System.out.println();
    }

    public static int[] changeEvenIndexedElementToZero(int[] array2){
        for (int i = 0; i < array2.length; i++) {
            if(i % 2 != 0){
                array2[i] = 0;
            }
        }
        return array2;
    }

}
