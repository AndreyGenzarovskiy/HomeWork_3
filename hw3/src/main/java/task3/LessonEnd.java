package task3;

import java.util.Scanner;

public class LessonEnd {
    private final int numOfLesson;

    public LessonEnd(){
        Scanner in = new Scanner(System.in);
        this.numOfLesson = in.nextInt();
    }

    private String getLessonEnd( int numOfLesson ){
        numOfLesson = numOfLesson*45 + (numOfLesson/2)*5 + ((numOfLesson +1)/2-1)*15;
        String str = Integer.toString(numOfLesson/60 + 9);
        String str2 = Integer.toString(numOfLesson%60);
        return str + " " + str2;
    }

    public void printEndOfLesson(){
        System.out.println("Enter number of lesson: " + getLessonEnd(numOfLesson));
    }

}
