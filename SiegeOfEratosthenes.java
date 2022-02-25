import java.util.*;
class SiegeOfEratosthenes {
  
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        PrintPrimeUpTo(n);
    }
}

    private static void PrintPrimeUpTo(int n) {
       int[] arr = new int[n+1];
       Arrays.fill(arr , 0);
       for(int i = 2 ; i < n ; i++){
        if(arr[i]==0){
            for(int j = i*i ; j < arr.length ; j=i+j){
                arr[j] = 1;
            }
        }
       } 
       for (int i = 2; i < arr.length; i++) {
          if(arr[i]==0){
            System.out.print(i+" ");
          }
       }
    }
    
}