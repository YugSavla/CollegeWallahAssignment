import java.util.Scanner;

public class Least {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b) {
            if (a < c) 
            {
                System.out.println("a is the smallest: " + a);
            } else 
            {
                System.out.println("c is the smallest: " + c);
            }
        } else if (b < c) 
        {
            System.out.println("b is the smallest: " + b);
        } else 
        {
            System.out.println("c is the smallest: " + c);
        }
    }
}
