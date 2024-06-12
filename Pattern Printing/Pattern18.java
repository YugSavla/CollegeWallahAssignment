import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int i;
        for (int k = 1; k <= n-1; k++) {
            for(int p=n-1;p>=k;p--){
                System.out.print("  ");
            }
            for (int l = 1; l <=k*2-1; l++) {
                if(l==1 || l==k*2-1){
                    System.out.print("# ");
                }
                else 
                {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        for ( i = 1; i <= n; i++) {
            
           
            for (int j = 1; j <= 2*n-1; j++) {
                if(i==j || (j+i)==2*n){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
                
                
            }
            System.out.println();
        }
    }
}
