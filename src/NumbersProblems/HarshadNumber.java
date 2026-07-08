package NumbersProblems;
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid Number");
            return;
        }
        int originalNum = num;
        int sum = 0;
        while(num>0){
            int lastNum = num % 10;
            sum = sum + lastNum;
            num = num/10;
        }
        if(originalNum % sum == 0){
            System.out.println("Harshad Number");
        }else {
            System.out.println("Not Harshad Number");
        }
    }
}
