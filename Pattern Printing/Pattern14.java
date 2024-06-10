import java.util.*;
class Pattern14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print((char)(j+64));
            }
            for (int j = 1; j < i; j++) {
                if(i==1){
                    continue;
                }
                System.out.print((char)(j+1+64)+"");
            }
            System.out.println();
        }
    }
}