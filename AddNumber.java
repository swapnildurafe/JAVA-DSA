class AddNumber{
    public static int add(int nums){
        if(nums == 0){
            return 0;
        }
        else if(nums % 9 == 0){
            return 9;
        }
        else{
            return nums%9;
        }
    }
    public static void main(String[] args){
        int nums = 25;
        System.out.print(add(nums));
    }
}