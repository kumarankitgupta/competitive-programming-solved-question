import java.util.Arrays;
public class Two_sum {
    public static void main(String[] args) {
        int[] outarr = new int[2];
        int arr[] = {2,11,15,7};
        int target = 9;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    outarr[0] = i;
                    outarr[1] = j;
                    break;
            }
        }  
    }
    System.out.println(Arrays.toString(outarr));
}
}
