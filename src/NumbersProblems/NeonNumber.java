package NumbersProblems;
import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        int lastNum = 0;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }if(sum==num){
            System.out.println("NeonNumber");
        }else{
            System.out.println("Not a NeonNumber");
        }
    }
}
