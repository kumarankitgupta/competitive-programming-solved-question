import java.util.Scanner;

public class gcd_and_lcm {
    public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int prod = n1 * n2;
    while(n1%n2 != 0){
        int rem = n1 % n2;
        n1 = n2;
        n2 = rem;
    }
    System.out.println("gcd = "+n2);
    System.out.println("lcm = "+(prod/n2));

  }
}
