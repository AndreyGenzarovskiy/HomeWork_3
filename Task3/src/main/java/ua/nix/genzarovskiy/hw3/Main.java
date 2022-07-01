package ua.nix.genzarovskiy.hw3;
import java.util.Scanner;
import static ua.nix.genzarovskiy.hw3.LessonEnd.GetLessonEnd;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter number of lesson: ");
        Scanner in = new Scanner(System.in);
        int numOfLesson = in.nextInt();
        System.out.print(GetLessonEnd(numOfLesson));
    }
}


