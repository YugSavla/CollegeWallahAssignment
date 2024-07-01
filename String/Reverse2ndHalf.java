import java.util.Scanner;

public class Reverse2ndHalf {
    static void swap(char[] str,int i,int j){        
            while (i<=j) 
                
            {
            char temp=str[i];
            str[i]=str[j];
            str[j]= temp;
                i++;j--;
        }       
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String with even length");
        String str=sc.next();
        String ans="";
        char[] Nstr =str.toCharArray();
            int i=Nstr.length/2;
            int j=Nstr.length-1;
            swap(Nstr, i,j);
              
        for (char c : Nstr) {
           System.out.print(c);
        }
        //System.out.println(ans);    
    }
}
