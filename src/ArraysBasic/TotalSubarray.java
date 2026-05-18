package ArraysBasic;

public class TotalSubarray {
    public static void main(String[] args) {

        System.out.println("Total subarray in a array is : " + (5*6)/2);
        int[] arr = {1,2,3,5,7};
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print( arr[k] );
                    if(k < j){
                        System.out.print( "," );
                    }
                }System.out.println("]");
            }
        }
    }
}
