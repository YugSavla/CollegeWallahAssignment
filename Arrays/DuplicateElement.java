import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the size of the array");
           int n=sc.nextInt();
           int[] arr=new int [n];
           System.out.println("Enter the elements of the arrays");
           for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
           }
           for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" Duplicate element");
                }
            }
           }
           
    }
}
