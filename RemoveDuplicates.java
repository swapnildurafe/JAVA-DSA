import java.util.*;
class RemoveDuplicates{

    public static void main(String[] args){
        String s = "programming";
        System.out.print(remdup(s));
    }
    public static String remdup(String s){

        char[] c = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char ch : c ){
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : set){
            sb.append(ch);
        }
        return sb.toString();
    }
}