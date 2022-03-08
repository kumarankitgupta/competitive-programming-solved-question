import java.util.Scanner;
public class dishes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int dish = 0 ;
                while(b != 0){
                    if(a == 0 && c == 0){
                        b = 0 ;
                    }
                    else if(a != 0){
                        a--;
                        b--;
                        dish++;
                    }
                    else if(b != 0 && c !=0){
                        b--;
                        c--;
                        dish++;
                    }
                }
                if(dish >= n)
                System.out.println("YES");
                else
                System.out.println("NO");
            }
        }
    }
}
