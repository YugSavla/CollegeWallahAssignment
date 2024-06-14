import java.util.Scanner;

class GreaterThanX{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Size of the arrays");
        int n=sc.nextInt();
        System.out.println("Enter Numbers");
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element the x");
        int x=sc.nextInt();int xInc=0;
        for (int i = 0; i < arr.length; i++) {
            if(x>arr[i]) {
                xInc++;
            }
        }  
        System.out.println("Number of element greater than x : "+xInc);
    }
}