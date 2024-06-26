import java.util.Scanner;

public class SetZero3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        boolean firstRowZero = false;
        boolean firstColZero = false;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                                
            }
            
        }
        
        for (int j = 0; j < m; j++) {
                
            if (arr[0][j] == 0) {
                firstRowZero=true;
        }
    }
    for (int i = 0; i < n; i++) {
                
        if (arr[i][0] == 0) {
            firstColZero=true;
    }
}
        for (int i = 1; i <n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if(arr[i][0]==0){
                for (int j = 1; j < m; j++) {
                    arr[i][j]=0;
                }
            }
            
        }
        for (int j =1; j < m; j++) {
            if(arr[0][j]==0){
                for (int i = 1; i < n; i++) {
                    arr[i][j]=0;
                }
            }
            
        }
        if (firstRowZero==true) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }
        if (firstColZero==true) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
