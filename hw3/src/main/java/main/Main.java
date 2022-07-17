package main;

import task1.SumOfNumbers;
import task2.NumOfOccurenceOfCharacters;
import task3.LessonEnd;

public class Main {
    public static void main(String[] args){
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        sumOfNumbers.printSumOfNumbers();
        NumOfOccurenceOfCharacters numOfOccurenceOfChar = new NumOfOccurenceOfCharacters();
        numOfOccurenceOfChar.printNumsOfOccuringChars();
        LessonEnd lessonEnd = new LessonEnd();
        lessonEnd.printEndOfLesson();
    }
}
