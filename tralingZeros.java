import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class tralingZeros {
    static class Read {
        BufferedReader br;
        StringTokenizer st;
 
        public Read()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
       Read sc = new Read();
       int t = sc.nextInt();
       for(int j = 0 ; j < t ; j++){
        int number = sc.nextInt();
        int i =1;
        int sum = 0;
        int out = number;
        while(out != 0){
         int divisor = (int) Math.pow(5,i);
         out = number / divisor;
         sum = sum + out ;
         i++;
        }
        System.out.println(sum);
       }
    }
}
