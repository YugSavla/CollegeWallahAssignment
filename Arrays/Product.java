import java.nio.channels.DatagramChannel;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements in arrays");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int product=1;
        for (int i = 0; i < n; i++) {
            product=product*arr[i];
        }
        System.out.println("Product is"+product);
    }
}
