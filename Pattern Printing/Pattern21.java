
import java.util.Scanner;
public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int k=1;
        for (int i = 1; i <= n-1; i++) {
            for( k=1;k<=i;k++){
                System.out.print("*");

            }
            for (int j = 2 * (n - i) - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=2*n-1;i++){
            System.out.print("*");
        
        }
        System.out.println();
        for(int i=1;i<=2*n-1;i++){
            System.out.print("*");
        
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for( k=n-1;k>=i;k--){
                System.out.print("*");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(" ");
            }
            for(k=n-1;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
