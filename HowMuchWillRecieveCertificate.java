import java.util.Scanner;

public class HowMuchWillRecieveCertificate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int numOfstud = 0;
            int Twatch;
                while(n-->0){
                Twatch = 0;
                int[] stud = new int[k];
                    for (int j = 0; j < stud.length; j++) {
                        stud[j] = sc.nextInt();
                        Twatch = Twatch + stud[j];
                    }
                    int q = sc.nextInt();
                    if(Twatch >= m && q <= 10){
                        numOfstud++;
                    }
            }
            System.out.println(numOfstud);
        }
    }
}
