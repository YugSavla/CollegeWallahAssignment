package Arrays;

import java.util.Scanner;

public class SecondLaegest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of  array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter elements in arrays");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int k=arr[0];
        for (int i = 0; i < n; i++) {
           k= Math.max(k,arr[i]);
        }
        int l=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=k){
                 l= Math.max(l,arr[i]);
            }
        }
        System.out.println("Largest is "+k+" Second largest is "+l);
    }
}
