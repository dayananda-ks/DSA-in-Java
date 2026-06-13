package ArraysBasic;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int secLarge(int[] arr) {
        Arrays.sort(arr);
        for(int i = (arr.length)-1; i >=0 ; i--){
            if(arr[(arr.length)-1] > arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}

public class SecLarge {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.secLarge(new int[]{1, 1}));

    }
}


