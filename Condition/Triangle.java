import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c && a==c){
            System.out.println("Equilateral Triangle");
        }
        else if(a!=b && b!=c && c!=a)
        {
            System.out.println("Scalene Triangle");
        }
        else
        {
            System.out.println("Isosceles Triangle");
        }
    }
}
