class CountCharacters{
    public static void main(String[] args){
        String s  = "Hello Java";
        int count = 0;
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i) !=' ')
            {
                count++;
            }
        }
        
        System.out.println("The string "+s+" contains "+count+" characters");
    }
}