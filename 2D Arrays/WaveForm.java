import java.util.*;
public class WaveForm {
    static void print(int[][] a){
        for (int k[] : a) {
            for (int j : k) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of column");
        int m=sc.nextInt();
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int arr[][]=new int[n][m];
        
        System.out.println("Enter the element");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (i%2==0) {
                    System.out.print(arr[n-1-i][j]+" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            //System.out.println();
        }
    }
    
}
