
import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of column");
        int m=sc.nextInt();
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the element");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int max=arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Maximum element is : "+max);
    }
}
