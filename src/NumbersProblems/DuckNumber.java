package NumbersProblems;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Its not a Duck Number");
            return;
        }
        int lastDigit =0;
        while (number > 0){
            lastDigit = number % 10;
            if(lastDigit == 0){
                System.out.println("It a Duck Number");
                return;
            }else{
                number = number / 10;
            }
        }System.out.println("It is not a Duck Number");
    }
}
