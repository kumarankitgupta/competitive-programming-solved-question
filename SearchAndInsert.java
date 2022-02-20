import java.util.Scanner;
public class SearchAndInsert {
    public static int searchInsert(int[] nums, int target) {
        int l=0 , u = nums.length-1;
        int mid = 0 ;
        while(l<=u){
            mid = (l+u)/2;
            if(target == nums[mid]){
                return mid;
            }
           
            else if(target < nums[mid])
            u = u - 1;
            else
            l = l + 1;
        }
        if(l>u)
        return l;
        else
        return ++u;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the target element");
            int target = in.nextInt();
            int result = searchInsert(arr, target);
            System.out.println(result);
        }
    }
}
