public class MergeSortArray1 {
    public static void main(String[] args) {
        int[] a={11,33,42,71,111,112};
        int[] b={1,2,26,54,69,81,99};
        int[] c=new int[a.length+b.length];
        int i=a.length-1,j=b.length-1,k=c.length-1;
        while (i>=0 && j>=0) {
            if(a[i]>=b[j]){
                c[k]=a[i];
                i--;k--;
            }
            else if(a[i]<b[j]){
                c[k]=b[j];
                j--;k--;
            }
        }
        //if (i==0) {
            while (j>=0) { // Copy remaining elements of b
                c[k]=b[j];
                j--;
                k--;
            } 
        //}
                       
            while (i>=0) {
                c[k]=a[i];
                i--;k--;
            }         
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
