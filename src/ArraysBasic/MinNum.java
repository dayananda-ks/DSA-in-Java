package ArraysBasic;

import java.util.HashMap;
import java.util.Map;

public class MinNum {
    public static void main(String[] args) {

        int[] array = {4,7,5,18,3};
        Map<Integer,Integer> map = new HashMap<>();
        int min = array[0];
        for(int index = 0; index < array.length; index++){
            if(array[index] < min){
                min = array[index];
            }
        }
        System.out.println("Minimum number in a array is : " + min);
    }
}
