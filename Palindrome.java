class Palindrome{
    public static boolean checkPalindrome(String sr){

        int start = 0;
        int end = sr.length()-1;

        while(start < end){
            if(sr.charAt(start) != sr.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
    public static void main(String[] args){
        String sr = "abcdcbanitin";
        System.out.println(checkPalindrome(sr));
    }
}