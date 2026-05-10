
//Linear Traversal
//Linear traversal is a fundamental technique in computer science that involves visiting each element of a data structure sequentially.
// This method is commonly used in arrays, linked lists, and other linear data structures.
// The primary purpose of linear traversal is to access or manipulate each element in a specific order, typically from the first to the last.


package BasicDSA;
public class LinearTraversal {
    public static void main(String[] args) {
        int[] array = {4,7,5,18,3};
        int Max = array[0];
        for(int index = 0; index < array.length; index++){
            if(array[index] > Max){
                Max = array[index];
            }
        }System.out.println("Maximum number in a array is :" + Max);
    }
}