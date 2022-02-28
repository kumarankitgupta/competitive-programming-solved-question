import java.util.Scanner;

public class NoOfDaysToRich {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            while(t-->0){
                int current = in.nextInt();
                int aim = in.nextInt();
                int increment =in.nextInt();
                System.out.println((aim - current)/increment);
            }
        }
    }
}
