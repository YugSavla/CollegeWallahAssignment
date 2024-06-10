package Loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num1=1,num2=1;
        if(n==1) {System.out.println("Fibonacci Series is " +num1);}
        else if(n>=2) {System.out.print("Fibonacci Series is " +num1+" "+num2);}
        {
        for(int i=1;i<=n-2;i++) {
            int c = num1 + num2;
            num1 = num2;
            num2 = c;
            System.out.print(" " + c);
        }
        }
    }
}
