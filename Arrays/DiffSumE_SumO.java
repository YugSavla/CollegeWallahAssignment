//Find the difference between the sum of elements at even indices to the sum of elements at odd indices.

import java.util.Scanner;

public class DiffSumE_SumO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of  array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        int sumE=0,sumO=0;
        System.out.print("Enter elements in arrays ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            if(i%2==0){
                sumE=sumE+arr[i];
            }
            else{
                sumO=sumO+arr[i];
            }            
        }
        System.out.println("Difference of Sum at even and odd indices is : "+(sumE-sumO));
    }
}
