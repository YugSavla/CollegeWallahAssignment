import java.util.Scanner;

public class Basic10 {
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
        //System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
