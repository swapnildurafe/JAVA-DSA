// Input: s = "()"
// Output: true

class ValidParenthesis{
    
    public static void main(String[] args){
        String s = "([]))";
        System.out.print(parenthesis(s));
    }
    
    public static boolean parenthesis(String s){
        while(true){
            if(s.contains("()")){
                s = s.replace("()","");
            }
            else if(s.contains("[]")){
                s = s.replace("[]","");
            }
            else if(s.contains("{}")){
                s = s.replace("{}","");
            }
            else{
                return s.isEmpty();
            }
        }
    }
}