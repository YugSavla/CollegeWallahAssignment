import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of a rows and columns");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        
        int minc=0,minr=0,maxc=n-1,maxr=n-1;int k=1;
        while(minc <=maxc && minr<=maxr){
            for (int j = minc; j <=maxc ; j++) {
                arr[minr][j]=k;    
                k++;
            }
            minr++;
            if(minc>maxc || minr>maxr) break;
            for (int i = minr; i <= maxr; i++) {
                arr[i][maxc]=k;    
                k++;
            }
            maxc--;
            if(minc>maxc || minr>maxr) break;
            for (int j = maxc; j >=minc; j--) {
                arr[minr][j]=k;    
                k++;
            }
            maxr--;
            if(minc>maxc || minr>maxr) break;
            for (int i = maxr; i >=minr; i--) {
                arr[i][minc]=k;    
                k++;
            }
            minc++;
            if(minc>maxc || minr>maxr) break;

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
