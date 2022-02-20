import java.util.Scanner;
public class div_Num {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            for(int i = 0; i<n ; i++){
                int num = sc.nextInt();
                if(num % k == 0)
                count++;
            }
            System.out.println(count);
        }
    }
}
