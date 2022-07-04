package practice_4;

public class AvarageOfArray {

    public static float getAvarageOfArray(int[] array){
        int avarage = 0;
        for (int i = 0; i < array.length; i++) {
        avarage += array[i];
        }
        return avarage/(float)array.length;
    }
    public static String getEqualsAvarages(float avarage1stArray, float avarage2ndArray){
        String answer = null;
        if(avarage1stArray < avarage2ndArray){
            answer = "Second arrays avarage is bigger" ;
        }
        else if (avarage1stArray > avarage2ndArray){
            answer = "First arrays avarage is bigger";
        }
        else{
            answer = "avarages is equals";
        }
        return answer;
    }
}
