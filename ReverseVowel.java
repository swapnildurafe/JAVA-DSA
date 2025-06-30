import java.util.*;
class ReverseVowel{
    public static String reverse_vowel(String s){
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start<end){
            if(!isVowel(ch[start])){
                start++;
            }
            else if(!isVowel(ch[end])){
                end--;
            }
            else{
                swapping(ch,start,end);
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U'){
            return true;
        }
        return false;
    }
    public static void swapping(char[] ch,int num1,int num2){
        char temp = ch[num1];
        ch[num1] = ch[num2];
        ch[num2] = temp;
    }

    public static void main(String[] args){
        String s = "hello";
        System.out.print(reverse_vowel(s));
    }

}