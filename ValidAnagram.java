// Input: s = "anagram", t = "nagaram"
// Output: true

public class ValidAnagram{
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagara";
        System.out.print(checkAnagram(s,t));
    }
    public static boolean checkAnagram(String s, String t)
    {
        int m = s.length();
        int n = t.length();
        if(m != n){
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i<s.length();i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int j=0;j<s.length();j++){
            count[t.charAt(j) - 'a']--;
        }
        for(int k=0;k<count.length;k++){
            if(count[k] != 0){
                return false;
            }
        }
        return true;
    }
}