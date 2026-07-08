package ArraysBasic;
import java.util.ArrayList;
public class DuplicateNum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }else{
                System.out.println("It Contain Duplicates Number");
                return;
            }
        }System.out.println("It Do not contain Duplicates");
    }
}
