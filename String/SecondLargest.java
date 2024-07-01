import java.util.Scanner;

public class SecondLargest {
    static String maximum(String max,String str){
        String a=purify(max);String b=purify(str);
        if(a.length()>b.length()) return max;
        else if(a.length()<b.length()) return str;
        else {
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i)>b.charAt(i)) return max;
                else if(a.charAt(i)<b.charAt(i)) return str;
            }
            return max;
        }

    }
    static String purify(String a){
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!='0') return a.substring(i);
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the string array");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.next();
        }
        String max=arr[0],smax;
        for (int i = 0; i < arr.length; i++) {
            max=maximum(max,arr[i]);
        }
        System.out.println();
    }
}
