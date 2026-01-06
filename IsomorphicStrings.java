// Input: s = "egg", t = "add"      KEY     e     g     g   ||     f     o    o                            
// Output: true                     VALUE   a     d     d   ||     b     a    r          
// Explanation:
// The strings s and t can be made identical by:
// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
import java.util.*;
class IsomorphicStrings{
    public static boolean isIso(String s, String t){
        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i)))
            {
                if(!hm.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                }
            }
            else{
                if(hm.containsValue(t.charAt(i)))
                {
                    return false;
                }
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s = "egg";
        String t = "add";
        System.out.print(isIso(s,t));
    }
}