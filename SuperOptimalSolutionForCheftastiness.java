import java.util.Scanner;

public class SuperOptimalSolutionForCheftastiness {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int s = sc.nextInt();
                if(s <= n)
                System.out.println(s);
                else
                System.out.println(n - (s-n));

            }
        }
    }
}
