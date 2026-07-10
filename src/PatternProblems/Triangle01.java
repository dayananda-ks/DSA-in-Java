package PatternProblems;

import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows;i++){
            for(int j = 0; j < i; j++){
                int temp = (i+j) % 2 ;
                System.out.print(temp + " ");
            }System.out.println();
        }
    }
}
