import java.util.Scanner;

public class ReverseConcate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        StringBuilder str=new StringBuilder(sc.nextLine()) ;
        String str1=str.toString();
        int i=0,j=str.length()-1;
        while (i<j) {
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
        str1=str1+str.toString();
        System.out.println(str1);
    }
}
