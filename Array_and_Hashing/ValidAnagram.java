package Array_and_Hashing_2;
import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length())
            return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String s2 = new String(s1);
        String t2 = new String(t1);
        if (s2.equals(t2)) return true;
        return false;
    }
    
    public static void main(String[] args){
        ValidAnagram solution = new ValidAnagram();
        String s = "abcdefga";
        String t = "cdeabfga";
        System.out.println(solution.isAnagram(s, t));
    }
}
