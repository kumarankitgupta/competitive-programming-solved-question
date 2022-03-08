import java.util.Scanner;
public class equalInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int max = -1;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                    if(arr[i] >= max)
                    max = arr[i];
                }   
                int rounds = -1;
                for (int i = 0; i < arr.length; i++) {
                    int result = max - arr[i];
                    if(result >= rounds)
                    rounds = result;
                }
                System.out.println(rounds);
            }
        }
    }
}
