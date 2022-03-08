import java.util.*;
class ReverseUsingStack {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}


class Solution {
    
    public String reverse(String S){
        char[] stack = new char[S.length()];
        int push = -1;
        int i = 0;
        while(i < S.length()){
            stack[++push] = S.charAt(i);
            i++;
        }
        i = push;
        String s="";
        while(i > -1){
            s = s + stack[i];
            i--;
        }
        return s;
    }

}