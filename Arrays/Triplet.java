import java.util.Scanner;

public class Triplet {
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
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if(x==(i+j+j2))
                    {
                        System.out.println(i+" "+j+" "+j2);
                        xInc++ ;
                    }
                }
            }
        }
        System.out.println("No. of tripletes are : "+xInc);
    }

}
