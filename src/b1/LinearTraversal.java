package b1;

public class LinearTraversal {
    public static void main(String[] args) {
        
        int[] array = {4,7,5,18,3};
        int Max = array[0];
        for(int index = 0; index < array.length; index++){
            if(array[index] > Max){
                Max = array[index];
            }  
        }
        System.out.println("Maximum number in a array is : " + Max);
    }
}
