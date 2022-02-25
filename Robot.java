public class Robot {

    public static String moveRobots(String s1, String s2){
        int n = s1.length();
        int i = 0;
        int j = 0;
        while(i < n && j < n){
            if(s1.charAt(i) == '#') i++;
            else if(s2.charAt(j) == '#') j++;
            else if(s1.charAt(i) != s2.charAt(j)) return "No";
            else if(s1.charAt(i) == 'B' && i>j) return "No";
            else if(s1.charAt(i) == 'A' && j>i) return "No";
            else{
                i++;
                j++;
            }
        }
        return "Yes";
    }
    
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        String result = moveRobots(s1,s2);
        System.out.print(result);
    }
}
