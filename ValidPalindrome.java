// Input: s = "A man, a plan, a canal: Panama"
// Output: true
import java.util.*;
class ValidPalindrome{
    public static void main(String[] args){
        String s = "n i t i : : n";
        System.out.print(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}