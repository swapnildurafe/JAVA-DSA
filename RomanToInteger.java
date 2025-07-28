// Input: s = "III"
// Output: 3
// Explanation: III = 3.
import java.util.*;
class RomanToInteger{

    public static void main(String[] args){
        String s = "IIIV";
        System.out.print(convert(s));
    }
    
    public static int convert(String s){
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int result = hm.get(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--){
            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))){

                result = result - hm.get(s.charAt(i));
            }
            else{
                result = result + hm.get(s.charAt(i));
            }
        }
        return result;
    }
}