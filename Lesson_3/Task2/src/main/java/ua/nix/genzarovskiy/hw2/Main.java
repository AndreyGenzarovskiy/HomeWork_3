package ua.nix.genzarovskiy.hw2;
import static ua.nix.genzarovskiy.hw2.NoOfOccurenceOfCharacters.GetOccuringChar;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){

       Scanner in = new Scanner(System.in);
       String str = in.nextLine();
       str = str.replaceAll("[^a-zA-Z]", "");
       System.out.println(GetOccuringChar(str));

       }
}

