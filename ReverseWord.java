import java.util.*;
public class ReverseWord {

    public static String revWord(String s){

        String[] str = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            sb.append(i);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args){
            System.out.println(revWord("hello world"));
    }
}