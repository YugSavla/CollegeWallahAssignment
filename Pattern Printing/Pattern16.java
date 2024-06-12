import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i);
        
        }
        for(int i=n-1;i>=1;i--){
            System.out.print(i);
        
        }
        System.out.println();
        int k,m=1;
        for (int i = 1; i <= n; i++) {
            m=1;
            for( k=n-1;k>=i;k--){
                System.out.print(m);
                m++;
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(" ");
                m++;
            }
            for(k=n-i;k>=1;k--){
                System.out.print(k);
             
            }
            System.out.println();
        }
    }
}
