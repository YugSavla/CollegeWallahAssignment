import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is the largest : "+a);
            }
            else {
                System.out.println("c is the largest : "+c);
            }
        }
        else if(b>c){
            System.out.println("b is the largest : "+b);
        }
        else {
            System.out.println("c is the largest : "+c);
        }
    }
}
