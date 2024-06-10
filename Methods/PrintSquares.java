package Methods;
import java.util.*;
class Square{
    void square(int n){
        for(int i=1;i<=n;i++) {
            System.out.println("Square of "+i+"is " + (i* i));
        }
    }
}
public class PrintSquares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n natural numbers");
        int n=sc.nextInt();
        Square s=new Square();
        s.square(n);
    }
}
