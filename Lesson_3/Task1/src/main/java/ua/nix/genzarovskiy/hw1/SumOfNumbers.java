package ua.nix.genzarovskiy.hw1;

public class SumOfNumbers {
    public static int GetSumOfNumbers(String replacedvalue) {
        String replacedValue = replacedvalue.replaceAll("[^0-9]", "");
        int[] result = new int[replacedValue.length()];

        for (int i = 0; i < replacedValue.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(replacedValue.charAt(i)));
        }

        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + result[i];
        }
        return sum;
    }
}