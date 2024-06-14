import java.util.Scanner;

public class Palindrome {
   
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
        boolean flag=true;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]==arr[arr.length-i-1]){
                 flag=true;
            }
            else{
                flag=false;
            }
        }
        if (flag == true) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
