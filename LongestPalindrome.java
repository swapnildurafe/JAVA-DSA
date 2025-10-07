class LongestPalindrome{
    public static String longestPalindrome(String s){
        String longest = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a = s.substring(i,j+1);
                if(isPalindromic(a) && a.length() > longest.length()){
                    longest = a;
                }
            }
        }
        return longest;
    }

    public static boolean isPalindromic(String a){
        int start = 0;
        int end = a.length()-1;
        while(start < end){
            if(a.charAt(start) != a.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "babac";
        System.out.println(longestPalindrome(s));
    }
}