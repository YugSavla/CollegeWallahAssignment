import java.util.*;
class Pattern4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                if (i%2==1) System.out.print((j+1)+" ");
                else System.out.print((char)(j+1+64)+" ");
            }
            System.out.println();
        }
    }
}