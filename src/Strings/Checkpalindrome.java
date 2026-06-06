package Strings;
public class Checkpalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        boolean flag = true;
        int start = 0, end = s.length() - 1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                flag = false;
                break;
            }
        }if(flag){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
