import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int rx = (int) Math.abs(x1 - x2);
            int yx = (int) Math.abs(y1 - y2);
            if(rx >= yx)
            System.out.println(rx);
            else
            System.out.println(yx);
        }
    }
}
