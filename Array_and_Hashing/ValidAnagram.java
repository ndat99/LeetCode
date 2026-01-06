package Array_and_Hashing;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length())
            return false;
        int[] charCounts = new int[26];
        for (int i=0; i<s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        for (int count : charCounts){
            if (count != 0)
                return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        ValidAnagram solution = new ValidAnagram();
        String s = "abcdefg";
        String t = "cdefabg";
        System.out.println(solution.isAnagram(s, t));
    }
}
