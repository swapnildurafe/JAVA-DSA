class SumOdSqrOddNo{

    public static int sqrOfOdd(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + (2*i-1) * (2*i-1);
        }
        return sum;
    }

    public static void main(String[] args){
        int n = 3;
        int n1 = 9;
        System.out.println(sqrOfOdd(n));
        System.out.println(sqrOfOdd(n1));
    }
}