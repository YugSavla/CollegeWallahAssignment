import java.util.Scanner;

public class BubbleSort {
    static void swap(int a , int b ,int arr[]){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enetr the elements");
        for (int i = 0; i < arr.length; i++) {
            
        
            arr[i]=sc.nextInt();
        } 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    swap(i,j,arr);
                }
                
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
// int n=arr.length;
//         for (int i = 0; i < n-1; i++) {
//             for (int j = 0; j < n-1; j++) {
//                 if(arr[j+1]<arr[j]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
                
//             }
//         }