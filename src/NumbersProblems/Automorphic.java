package NumbersProblems;
import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sqr = num * num;
        int orginal = num;
        int power = 1;
        int count = 0;
        if(num ==0){
            count = 1;
        }else{
            while(num >0) {
                num = num / 10;
                count = count + 1;
            }
        }
        for(int i = 1; i <= count; i++) {
            power = power * 10;
        }
        if(orginal ==  sqr%power) {
            System.out.println("Automorphic number");
        }else{
            System.out.println("Not an Automorphic number");
        }
    }
}