import java.util.Scanner;

public class WhichMovieToChoose {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long t = sc.nextLong();
            while(t-->0){
                long n = sc.nextLong() ; 
                long x = sc.nextLong() ;
                long big = 0;
                
                for (int i = 0; i < n; i++) {
                    long memory = sc.nextLong();
                    long rating = sc .nextLong();
                    if(memory <= x && big < rating){
                        big = rating ;
                    }
                }
                System.out.println(big);
            }
        }
    }
}
