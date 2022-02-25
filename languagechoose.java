import java.util.Scanner;
public class languagechoose {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t != 0){
                int[] a = new int[6];
                for(int i = 0 ; i < a.length ; i++){
                    a[i] = sc.nextInt();
                }
                if(a[0]+a[1]==a[2]+a[3])
                System.out.println(1);
                else if(a[0]+a[1] == a[4]+a[5])
                System.out.println(2);
                else
                System.out.println(0);
                t--;
            }
        }
    }
}
