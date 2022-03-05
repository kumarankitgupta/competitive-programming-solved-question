import java.util.Scanner;
public class SmallestSumPair {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                int small = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i +1; j < arr.length; j++) {
                        int res = arr[i] + arr[j];
                        if(res <= small){
                            small = res;
                        }
                    }
                }
                System.out.println(small);
            }
            
        } 
    }
}
