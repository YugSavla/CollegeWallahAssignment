import java.util.*;
public class Rotate90AntiClockWise {
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
        System.out.println("Enter the no. of rows and columns");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("ENter the Elements");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Og Matrix");
        print(a);
        //Transverse Matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int temp=a[i][j];
                 a[i][j]=a[j][i];
                 a[j][i]=temp;
            }
        }
        //Reverse Column
        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a.length; j++) {
                int temp=a[i][j];
                a[i][j]=a[n-i-1][j];
                a[n-i-1][j]=temp;
            }
        }
        print(a);
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < n/2; j++) {
        //             int temp=a[i][j];
        //             a[i][j]=a[i][n-1-j];
        //             a[i][n-1-j]=temp;                
        //     }
            
        // }
        //print(a);
    }
}
