import java.util.*;
class IsomorphicStrings{

    public static boolean isIsomorphic(String s, String t){

        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        for(int i=0;i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                if(! hm.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            else{
                if(hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args){

        String s = "egg";
        String t = "fod";
        System.out.print(isIsomorphic(s,t));
    }
}
// HashMap is used . Hashmap has a pair. key--> value.