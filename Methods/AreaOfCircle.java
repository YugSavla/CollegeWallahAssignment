package Methods;
import java.util.*;
class Area{
    void area(double n){
        System.out.println("Area of a circle is "+(double)(22/7*n*n));
        }
    }
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n radius of a circle");
        double n=sc.nextDouble();
        Area s=new Area();
        s.area(n);
    }
}
