import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int i;
        for ( i = 1; i <= n; i++) {
            
           
            for (int j = 1; j <= 2*n-1; j++) {
                if(i==j || (j+i)==2*n){
                    System.out.print("#");
                }
                else{
                    System.out.print("  ");
                }
                
                
            }
            System.out.println();
        }
    }
}
