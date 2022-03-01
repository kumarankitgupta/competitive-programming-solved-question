import java.util.*;
public class parrallelProcessor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long t = sc.nextLong();
            while(t-->0){
                int n = sc.nextInt();
                long sum = 0;
                long[] arr = new long[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextLong();
                    sum = sum + arr[i];
                }
                long p1 = 0 , p2 = 0;
                long time = 0;
                long min = sum;
                int j = 0;
                while(j < n){
                    p1 = p1 + arr[j];
                    p2 = sum - p1 ;
                    long result = (long) Math.abs(p1 -p2);
                    if(result <= min){
                        min = result;
                        if(p1 >= p2)
                        time =p1;
                        else
                        time = p2;
                    }
                    j++;
                }
                System.out.println(time);
            }
        }
    }
}
