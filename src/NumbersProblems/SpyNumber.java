package NumbersProblems;
import java.util.Scanner;
public class SpyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(num > 0){
            int lastNum = num % 10;
            sum = sum + lastNum;
            product = product * lastNum;
            num /= 10;
        }if(product == sum){
            System.out.println("Spy Number");
        }else {
            System.out.println("Not Spy Number");
        }
    }
}
