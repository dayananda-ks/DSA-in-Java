package NumbersProblems;

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int orgingal = num;
        if(num <=0){
            System.out.println("Invalid number");
            return;
        }
        int tempNum = num;
        int count  = 0;
        while (num > 0) {
            count = count + 1;
            num = num / 10;
        }
        int sum = 0;
        for(int i = count; i > 0; i--){
            int temp = 1;
            int lasDigit = tempNum % 10;
            for(int j = 1; j <= i; j++){
                temp = temp * lasDigit;
            }
            sum = sum + temp;
            tempNum = tempNum / 10;
        }
        System.out.println("Sum: " + sum);
        if(sum == orgingal){
            System.out.println("Disarium Number");
        }else{
            System.out.println("Not Disarium Number");
        }
    }
}
