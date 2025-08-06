// Input :
// aabbbbeeeeffggg

// Output:
// a2b4e4f2g3

// Input :
// abbccccc

// Output:
// ab2c5

class reduceString{

    public static String reduce(String str){

        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count = 1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            result.append(str.charAt(i));
            if(count>1){
                result.append(count);
            }
            i = i + (count-1); //aaa
        }
        return result.toString();
    }

    public static void main(String[] args){
        String str = "aaabbbbbcdd";
        System.out.print(reduce(str));
    }
}
