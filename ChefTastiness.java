import java.util.Scanner;

public class ChefTastiness {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int N = sc.nextInt();
                int S = sc.nextInt();
                int maxdiff = -1;
                for (int i = 0; i <= N; i++) {
                    for (int j = 0; j <= N; j++) {
                        if(i+j == S){
                            int currdiff = Math.abs(i - j);
                            if(currdiff > maxdiff){
                                maxdiff = currdiff;
                            }
                        }
                    }
                }
                System.out.println(maxdiff);
            }
        }
    }
}
