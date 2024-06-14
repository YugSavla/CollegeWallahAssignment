import java.util.Scanner;

public class ThreeLargest {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the arrays");
        int n=sc.nextInt();
        System.out.println("Enter Numbers");
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],smax=Integer.MIN_VALUE,tmax=Integer.MIN_VALUE;//int  max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<=arr[i]) //max=Math.max(max,arr[i])
            {
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(max==arr[i]) //max=Math.max(max,arr[i])
            {
                continue;
            }
            if (smax<=arr[i]) {
                smax=arr[i];
            }
        }
            for (int i = 0; i < arr.length; i++) {
            if(max==arr[i] || smax==arr[i]) //max=Math.max(max,arr[i])
            {
                continue;
            }
            if (tmax<=arr[i]) {
                tmax=arr[i];
            }
        }
        System.out.println("Maximum "+max);
        System.out.println("Second Maximum "+smax);
        System.out.println("Third Maximum "+tmax);
    }
}
