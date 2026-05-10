package b1;

public class MinNum {
    public static void main(String[] args) {

        int[] array = {4,7,5,18,3};
        int min = array[0];
        for(int index = 0; index < array.length; index++){
            if(array[index] < min){
                min = array[index];
            }
        }
        System.out.println("Minimum number in a array is : " + min);
    }
}