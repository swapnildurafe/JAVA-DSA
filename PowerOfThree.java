// Input: n = 27
// Output: true
// Explanation: 27 = 33

class PowerOfThree{

    public static boolean isPower(int n){
        if(n<1){
            return false;
        }
        while(n>1){
            int remainder = n % 3;
            if(remainder != 0){
                return false;
            }
            else{
                n = n / 3;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int n = 27;
        int n1 = 45;
        System.out.println(isPower(n));
        System.out.println(isPower(n1));
    }
}