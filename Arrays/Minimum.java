import java.util.Scanner;

public class Minimum 
{
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
        int min=arr[0];//int  min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min>=arr[i]) //min=Math.min(min,arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum "+min);
    }
}

