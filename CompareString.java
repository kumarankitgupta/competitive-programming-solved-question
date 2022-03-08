import java.util.Scanner;
public class CompareString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();
                int result = 0;
                for (int i = 0; i < s1.length(); i++) {
                    if(s1.charAt(i)=='?'||s1.charAt(i)==s2.charAt(i))
                    result = 1;
                    else{
                        result = -1;
                        break;
                    }  
                }
                if(result == -1)
                System.out.println("No");
                else
                System.out.println("Yes");
            }
        }

    }
}
