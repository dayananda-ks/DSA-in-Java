package NumbersProblems;
import java.util.Scanner;
public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int suqareOfNum = num * num;
        int reverseOfNum = 0;
        while (num > 0) {
            int lastNum = num % 10;
            reverseOfNum = reverseOfNum * 10 + lastNum;
            num /= 10;
        }
        int squqareReversed = 0;
        int reversedNumSqaure = reverseOfNum * reverseOfNum;
        while (reversedNumSqaure > 0) {
            int lastNum = reversedNumSqaure % 10;
            squqareReversed = squqareReversed * 10 + lastNum;
            reversedNumSqaure /= 10;
        }
        if (suqareOfNum == squqareReversed) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not an Adam Number");
        }
    }
}
