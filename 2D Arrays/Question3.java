import java.util.Scanner;

public class Question3 {
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
        int[][] cord=new int[2][2];
        System.out.println("Enter the cordinate");
        for (int i = 0; i < cord.length; i++) {
            for (int j = 0; j < cord.length; j++) {
                cord[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for (int   i = cord[0][0]; i <=cord[1][0] ; i++) {
            for (int j = cord[0][1]; j <= cord[1][1]; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum is "+sum);        
    }
}
