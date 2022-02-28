import java.util.*;
public class HowmuchTime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int time = sc.nextInt();
            while(time-->0){
                int n = sc.nextInt();
                int p = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0 ; i < a.length ; i++){
                    a[i] = sc.nextInt();
                }
                int j = 0 , time = 0 ;
                while(j <= p-1){
                    if(a[j] == 0)
                    time = time + x ;
                    else
                    time = time + y ;
                    j++;
                }
                System.out.println(time);
                
            }
        }
    }
}
