import java.util.*;
public class AtmV2 {    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t != 0){
                String output = "";
                int n = sc.nextInt();
                int total = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                    if(total >= arr[i]){
                        output = output + "1";
                        total = total - arr[i];
                    }
                    else{
                        output = output + "0";
                    }
                }
                System.out.println(output);
                t--;
            }
        }
    }
}
