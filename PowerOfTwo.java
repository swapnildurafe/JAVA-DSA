class PowerOfTwo{
    public static boolean isTwo(int n){
        if(n<1){
            return false;
        }
        while(n>1){
            int remainder = n % 2;
            if(remainder != 0){
                return false;
            }
            else{
                n = n / 2;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int n3 = 16   ;
        System.out.println(isTwo(n3));
    }
}