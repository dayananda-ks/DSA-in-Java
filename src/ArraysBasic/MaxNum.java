package ArraysBasic;

public class MaxNum {
    public static void main(String[] args) {
        
        int[] array = {4,7,5,18,3};
        int max = array[0];
        for(int index = 0; index < array.length; index++){
            if(array[index] > max){
                max = array[index];

            }  
        }
        System.out.println("Maximum number in a array is : " + max);
    }
}
