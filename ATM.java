import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class ATM {
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

        float nextFloat() {return Float.parseFloat(next());}
 
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
        Read in = new Read();
        float require = in.nextFloat();
        float intial = in.nextFloat();
        if(intial >= require + 0.5f && (require % 5 == 0)){
            System.out.println(intial - require - 0.50f);
        }
        else
        System.out.println(intial);
    }
}
