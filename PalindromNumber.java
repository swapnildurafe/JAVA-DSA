// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

class PalindromNumber{

    public static boolean palin(int x){
        if(x<0){
            return true;
        }
        int original = x;
        int reverse = 0;
        while(x!=0){
            int rem = x % 10;
            reverse = reverse * 10 + rem;
            x = x / 10;
        }
        return original == reverse;
    }
    public static void main(String[] args){
        int x = 1212122;
        System.out.print(palin(x));
    }
}