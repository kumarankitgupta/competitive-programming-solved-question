import java.util.ArrayList;
import java.util.Arrays;

public class ProblemOfTheDay1Gfg {

    static void prank(long[] a, int n) { 
        long[] arr = new long[n];
        for(int i = 0; i < a.length ; i++){
           for(int j = 0; j <a.length ; j++){
               if(i == a[j])
               arr[j] = a[i]; 
           } 
        }
        for(int i = 0 ; i < arr.length ; i++)
        System.out.print(arr[i] + " ");
    }
    public static void name(long[] a,int n) {
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 0 ; i < a.length ; i++){
            list.add(i, a[i]);
        }
        for(int i = 0 ; i < a.length ; i++){
            a[i] = list.get((int) a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        long arr[] = {0,5,1,2,4,3};
        int n = arr.length;
        prank(arr, n);
        name(arr,n);
       
    
    }
    
}