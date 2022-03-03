import java.util.*;

class hoopjump
{	public static void main (String[] args) throws java.lang.Exception
	{
        try (Scanner sc = new Scanner(System.in)) {
            long t = sc.nextLong();
            while(t-->0){
                long n = sc.nextLong();
                long i = 1;
                while(n != 0){
                    i++;
                    if(i == n-1)
                    break;
                    n--; 
                }
                System.out.println(i);
            }
        }
        
	}
}

