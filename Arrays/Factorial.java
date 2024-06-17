import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of  array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        
                for (int i = 1; i<=n ; i++) {
            int  k=1;
            for (int j = 1; j <= i; j++) {
                 
                k=j*k;
               
            }
            arr[i-1]= k;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
