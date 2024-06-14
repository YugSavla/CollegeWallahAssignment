//Q10. Given an array of integers, change the value of all odd indexed elements to its second multiple and
//increment all even indexed values by 10.

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of  array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter elements in arrays ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            if(i%2==0){
                arr[i]+=10;
            }
            else{
                arr[i]*=2;
            }            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
