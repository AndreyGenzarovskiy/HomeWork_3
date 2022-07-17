package task2;

import java.util.Scanner;

public class NumOfOccurenceOfCharacters {
    private final String str;
    public NumOfOccurenceOfCharacters(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        this.str = str.replaceAll("[^a-zA-Z]", "");
    }

     String getOccuringChar(String str) {
        final int charCount = 55;
        int [] charsInStr= new int[charCount];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'z') {
                charsInStr[c - 'A']++;
            }
        }
        StringBuilder result = new StringBuilder();
        for( int i = 0; i < charCount; i++){
            if(charsInStr[i] != 0) {
                result.append(Character.toString((char) ('A' + i))).append(" - ").append(Integer.toString(charsInStr[i])).append('\n');
            }
        }
        return result.toString();
    }

    public void printNumsOfOccuringChars(){
        System.out.println(getOccuringChar(str));
    }

}
