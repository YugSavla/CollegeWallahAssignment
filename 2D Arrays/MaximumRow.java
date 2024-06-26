
import java.util.*;
public class MaximumRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the element");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum1=0,k=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int sum=0;
                sum=arr[i][j]+sum;
                if(sum1<sum){
                    sum1=sum;
                    k=i;
                }
            }
        }
        System.out.println("Row no. of highest is "+k);
    }
}