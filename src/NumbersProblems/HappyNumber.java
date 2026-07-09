package NumbersProblems;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if( number <= 0){
            System.out.println("Invalid number");
            return;
        }
        while (number !=1 && number !=4){
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            number = sum;
        }if(number == 1){
            System.out.println("It is a Happy Number");
        }else{
            System.out.println("It is not a Happy Number");
        }
    }
}