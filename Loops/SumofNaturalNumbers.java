package CollegeWallahAssignment;
import java.util.Scanner;
public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Positive natural number");
        int n=sc.nextInt(); int sum=0;
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("Sum of" +n+ "natural number is "+sum);
    }
}
