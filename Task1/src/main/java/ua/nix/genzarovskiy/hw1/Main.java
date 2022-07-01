package ua.nix.genzarovskiy.hw1;
import java.util.Scanner;
import static ua.nix.genzarovskiy.hw1.SumOfNumbers.GetSumOfNumbers;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String enteredString = in.nextLine();
        System.out.println(GetSumOfNumbers(enteredString));

    }
}