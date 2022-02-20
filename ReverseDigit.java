// leetcode problem
import java.util.Scanner;
public class ReverseDigit {
    public static int reverse(int num) {
        long copy=num,num_reverse=0;
            while(copy!=0){
                long r = copy % 10;
                num_reverse = num_reverse*10 + r;
                copy = copy/10;
               
            }
            if(num_reverse>=Math.pow(-2, 31)&&num_reverse<=(Math.pow(2, 31)-1)){
                int x = (int) num_reverse;
                return x;
            }
        return 0;
    }
    public static void main(String[] args) {
        int num ;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a number");
            num = in.nextInt();
        }
        if(reverse(num) != 0)
        System.out.println("Reverse number is " + reverse(num));
         else
        System.out.println("Out of range");
        
    }
}
