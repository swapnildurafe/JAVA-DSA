// 1 2 3 4 5 6 7 8

class Sqrt{
    public static int sqrt(int x){
        int start = 1;
        int end = x;
        

        while(start <= end){
            int mid = start + (end-start) /2;
            if(mid*mid > x){
                end = mid-1;
            }
            else if(mid*mid == x){
                return mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args){
        int x = 8;
        System.out.print(sqrt(8));
    }
}