import java.util.*;
class Pattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = i; j >= 1; j--) {
                if(i%2==0){
                    System.out.print("");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}