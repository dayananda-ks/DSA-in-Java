package PatternProblems;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int sum =1 ;
        for(int i = 1; i <= rows; i++){
            for(int j = 0; j < rows-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=sum; k++){
                System.out.print("*");
            }
            sum = sum + 2;
            System.out.println();
        }
    }
}
