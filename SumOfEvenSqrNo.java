class SumOfEvenSqrNo{

    public static void main(String[] args){
        int n =3;
        System.out.println(evensqr(n));
    }
    public static int evensqr(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + (2*i) * (2*i);
        }
        return sum;
    }
}