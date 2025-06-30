class UniqueChar1st{

    public static int checkUnique(String s){

        int[] freq = new int[26];
        char[] ch  = s.toCharArray();

        for(int i=0; i<ch.length; i++){
            char c = ch[i];
            freq[c-'a']++;
        }

        for(int i=0;i<ch.length;i++){

            if(freq[ch[i]-'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String s = "eeetcode";
        System.out.print(checkUnique(s));
    }
}