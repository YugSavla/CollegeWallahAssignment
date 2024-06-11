import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter n");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k=0; k  <= i*2; k++) {
                System.out.print(k+1);
            }
            
            System.out.println();
        }
    }
}
