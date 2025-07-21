// Input: s = "abcd", t = "abcde"
// Output: "e"
import java.util.*;
class FindDiff{
    public static void main(String[] args)
    {
        String s = "abcd";
        String t = "abcde";
        System.out.print(finddifff(s,t));
    }
    public static char finddifff(String s, String t)
    {
        int totalSumOfs = 0;
        for(int i=0;i<s.length();i++){
            totalSumOfs = totalSumOfs + s.charAt(i);
        }

        int totalSumOft = 0;
        for(int j=0;j<t.length();j++){
            totalSumOft = totalSumOft + t.charAt(j);
        }

        int totalSum = totalSumOft - totalSumOfs;
        return (char)totalSum;
    }
}