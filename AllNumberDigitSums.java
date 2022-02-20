import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class AllNumberDigitSums {
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
        int test = sc.nextInt();
        int i = 0;
        while(i < test){
            int number = sc.nextInt();
        int copy = number;
        int sum = 0;
        while(copy != 0)
        {
            int r = copy % 10;
            sum = sum +r;
            copy = copy / 10;
        }
        System.out.println(sum);
        i++;
        }
    }
}

