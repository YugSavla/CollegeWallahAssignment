package CollegeWallahAssignment;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min,gcd=0;
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        min=(a>b) ? b : a;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                 gcd=i;
            }
        }
        System.out.println("Gcd is " +gcd);
    }
}
