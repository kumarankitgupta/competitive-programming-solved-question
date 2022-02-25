import java.util.Arrays;
public class SmallestAbsoluteDifference {
    public static long kthDiff(long arr[], long n, long k)
    {   long[] B = new long[(int) k];
        int pos = 0;
        for (int i = 0 ; i < arr.length&&pos<=k+1; i++ ) {
            for (int j = i+1; j < arr.length; j++) {
               B[pos] = (long) (Math.abs(arr[i] - arr[j]));
               pos++; 
            }
        }
        Arrays.sort(B);
        return B[(int)k -1];
    }    public static void main(String[] args) {
        long A[] = {1, 2, 3, 4};
        long K = 3 ;
        long result = kthDiff(A , A.length , K);
        System.out.println("Output : "+result);
    }
    
}