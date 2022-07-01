package ua.nix.genzarovskiy.hw2;

public class NoOfOccurenceOfCharacters {

    public static String GetOccuringChar(String str) {
        final int charCount = 55;
        int [] charsInStr= new int[charCount];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'z') {
                charsInStr[c - 'A']++;
            }
        }
        String result = new String();
        for( int i = 0; i < charCount; i++){
            if(charsInStr[i] != 0) {
                result += Character.toString((char)('A' + i)) + " - " + Integer.toString(charsInStr[i]) + '\n';
            }
        }
        return result;
    }

}

