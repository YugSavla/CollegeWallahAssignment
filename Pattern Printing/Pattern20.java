import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int k=i;k<=n;k++){
                System.out.print("  ");
            }
            for (int j = 1; j <=i*2-1; j++) {
                if(j==1 || j==i || j==2*i-1 ||  i==n){
                    System.out.print("@ ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        int o=(n-1)*2-1;
        for (int l = 1; l <=n-1; l++) {
            for (int m = 0; m <=l; m++) {
                System.out.print("  ");
            }
            for (int p = 1; p <=o; p++) {
                if(p==1 || p==o || n==p+l){
                    System.out.print("@ ");
                }
                else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
            o=o-2;;
        }
    }
}
