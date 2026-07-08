package NumbersProblems;
public class StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int sum = 0;
        int originalNum = num;
        while(num>0){
            int lastNum = num % 10;
            int factorial = 1;
            num = num/10;
            for(int i = lastNum; i >=1; i--){
                factorial = factorial * i;
            }sum = sum + factorial;
        }if(sum == originalNum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }
}
