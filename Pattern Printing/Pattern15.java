import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print((char)(i+64));
        
        }
        System.out.println();
        int k,m=1;
        for (int i = 1; i <= n; i++) {
            m=1;
            for( k=n-1;k>=i;k--){
                System.out.print((char)(m+64));
                m++;
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(" ");
                m++;
            }
            for(k=n-1;k>=i;k--){
                System.out.print((char)(m+64));
                m++;
            }
            System.out.println();
        }
    }
}
