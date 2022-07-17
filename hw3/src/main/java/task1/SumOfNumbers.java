package task1;

import java.util.Scanner;

public class SumOfNumbers {
    private final String value;
    public SumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
    }

    int getSumOfNumbers(String replacedValue) {
        String str = replacedValue.replaceAll("[^0-9]", "");
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + result[i];
        }
        return sum;
    }

    public void printSumOfNumbers(){
        System.out.println(getSumOfNumbers(value));
    }

}
