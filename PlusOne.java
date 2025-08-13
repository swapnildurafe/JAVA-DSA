import java.util.*;
class PlusOne{
    public static int[] oneplus(int[] digits){

        int n = digits.length;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args){
        int[] digits = {1,2,3,4};
        int[] digit2 = {1,9};
        System.out.println(Arrays.toString(oneplus(digits)));
        System.out.println(Arrays.toString(oneplus(digit2)));
    }
}