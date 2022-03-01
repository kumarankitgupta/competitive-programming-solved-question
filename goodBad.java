import java.util.*;
public class goodBad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int bit = sc.nextInt();
            if(bit % 4 == 0)
            System.out.println("Good");
            else
            System.out.println("Not Good");
        }
    }
}
