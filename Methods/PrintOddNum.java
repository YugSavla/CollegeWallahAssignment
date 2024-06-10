import java.util.*;
class Print{
    void print(int a,int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for(int i=min;i<=max;i++){
            if(i%2!=0) {
                System.out.print(" "+i);
            }
        }
    }
}
public class PrintOddNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of first number");
        a=sc.nextInt();
        System.out.println("Enter the value of second number");
        b=sc.nextInt();
        Print ab=new Print();
        ab.print(a,b);
    }
}
