class EquiStrings{
    public static boolean isEqui(String s1, String s2){
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for(int i=0; i<freq.length;i++){
            if(Math.abs(freq[i]) > 3){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = "aaaaa";
        String s2 = "baaab";
        System.out.print(isEqui(s1,s2));
    }
}