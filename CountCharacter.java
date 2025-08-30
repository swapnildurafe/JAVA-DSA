class CountCharacter{
    public static boolean isBalanced(String nums){
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0;i<nums.length();i++){
            if(i%2==0){
                evenSum = evenSum + (nums.charAt(i)-'0');
            }
            else{
                oddSum = oddSum + (nums.charAt(i)-'0');
            }
        }
        return oddSum == evenSum;
    }
    public static void main(String[] args){
        String nums = "9999";
        String num2 = "1234";
        System.out.println(isBalanced(nums));
        System.out.println(isBalanced(num2));
    }
}