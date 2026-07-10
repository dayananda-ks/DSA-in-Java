package PatternProblems;

import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int sum = (2*rows)-1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = sum; k > 0; k--){
                System.out.print("*");
            }
            sum = sum - 2;
            System.out.println();
        }
    }
}
