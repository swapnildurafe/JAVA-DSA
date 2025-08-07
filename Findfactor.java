class Findfactor{

    public static void find(int num){
        int[] result = {};
        for(int i=1;i<num;i++){
            if(num % i == 0){
                System.out.println(i + "");
            }
        }
    }

    public static void main(String[] args){

        int num = 54;
        find(num);
    }
}