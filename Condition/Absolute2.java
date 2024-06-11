import java.util.Scanner;

public class Absolute2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Absolute value is : "+(-num));
        }
        else
        System.out.println("Absolute value is : "+(num)); 
    }
}
