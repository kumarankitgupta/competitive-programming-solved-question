import java.util.Scanner;

public class pawrimeme {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-->0) {
                String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length()-4 ; i++) {
                if(sb.charAt(i)=='p'&&sb.charAt(i+1)=='a'&&sb.charAt(i+2)=='r'&&sb.charAt(i+3)=='t'&&sb.charAt(i+4)=='y'){
                    sb.setCharAt(i+2, 'w');
                    sb.setCharAt(i+3, 'r');
                    sb.setCharAt(i+4, 'i');
                }
            }
            System.out.println(sb);
            }
        }
    }
}
