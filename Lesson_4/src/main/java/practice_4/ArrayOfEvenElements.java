package practice_4;

import java.util.ArrayList;

public class ArrayOfEvenElements {

    public static ArrayList<Integer> getArrayOfEvenElements(int[] array) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                    arrayList.add(array[i]);
            }
        }
        return arrayList;
    }
}
