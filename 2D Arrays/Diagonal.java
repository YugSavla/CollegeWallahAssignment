import java.util.Scanner;

public class Diagonal {
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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                if(i==j || i+j==n-1){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
