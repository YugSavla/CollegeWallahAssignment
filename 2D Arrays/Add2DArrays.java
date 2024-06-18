import java.util.*;

public class Add2DArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of column");
        int m=sc.nextInt();
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        int brr[][]=new int[m][n];
        int crr[][]=new int[m][n];
        System.out.println("Enter the element of A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element of B");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                brr[i][j]=sc.nextInt();
                crr[i][j]=arr[i][j]+brr[i][j];
            }
        }
        for (int[] is : crr) {
            for (int  is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }
    }
}
