package ua.nix.genzarovskiy.hw3;

public class LessonEnd {
    public static String GetLessonEnd( int numOfLesson ){
        numOfLesson = numOfLesson*45 + (numOfLesson/2)*5 + ((numOfLesson +1)/2-1)*15;
        String str = Integer.toString(numOfLesson/60 + 9);
        String str2 = Integer.toString(numOfLesson%60);
        return str + " " + str2;
    }
}
