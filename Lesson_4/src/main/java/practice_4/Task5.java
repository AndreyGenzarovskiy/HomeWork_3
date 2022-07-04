package practice_4;
import java.util.ArrayList;
import java.util.Scanner;
import static practice_4.utils.*;
import static practice_4.ArrayOfEvenElements.getArrayOfEvenElements;

public class Task5 {

    public static void task5() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scanner.nextInt();

        if(input <= 3) {
            while(input <= 3) {
                System.out.print("Enter number bigger then 3: ");
                input = scanner.nextInt();
            }
        }

        int[] array = initializeArray(input, 0, input);
        printArray(array);
        ArrayList<Integer> evenNumbers = getArrayOfEvenElements(array);
        int arrEven[] = new int[evenNumbers.size()];
        for(int i = 0; i < evenNumbers.size();i++)
        {
            arrEven[i] = evenNumbers.get(i);
        }
        printArray(arrEven);
    }

}
