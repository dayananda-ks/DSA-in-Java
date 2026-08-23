import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 3, 12};
        int start = 0;
        for(int end = 0; end < arr.length;end++){
            if(arr[end] != 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
