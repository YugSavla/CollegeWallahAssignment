import java.util.Scanner;

public class NonRepeating {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the arrays");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in arrays");
       for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
       }
       boolean flag=false;
       for (int i = 0; i < arr.length; i++) 
       {
            for (int j = 0; j < arr.length; j++) 
            {
                if(i!=j && arr[i]==arr[j]){
                    flag=false;
                    break;
                }
                else {
                    flag=true;
                }
            }
            if(flag==true){
                System.out.println("Non Repeating : "+arr[i]);
                break;
            }
        }
    }
}
