import java.util.*;

class days
{	public static void main (String[] args) throws java.lang.Exception
	{
        try (Scanner sc = new Scanner(System.in)) {
            long t = sc.nextLong();
            while(t-->0){
                long d = sc.nextLong();
                long f = sc.nextLong();
                long l = sc.nextLong();
                if(d < f)
                System.out.println("Too Early");
                else if(d >= f && d <= l)
                System.out.println("Take second dose now");
                else
                System.out.println("Too Late");

            }
        }
        
	}
}

