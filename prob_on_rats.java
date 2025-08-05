// Write a fun that accepts 3 parameters 
// r = 7,  unit = 2, n = 8, arr = [2,8,3,5,7,4,1,2]
// O/P = 4
public class prob_on_rats{
    public static int rats(int r, int n, int unit, int[] arr){

        int total_food = r * n; 
        int food_tillNow = 0;
        for(int i=0;i<arr.length;i++){
            food_tillNow = food_tillNow + arr[i];
            if(food_tillNow > total_food){
                return i+1;
            }
            
        }
        return 0;
    }

    public static void main(String[] args){
        int r = 7;
        int unit = 2;
        int n = 8;
        int[] arr = {2,8,3,5,7};
        System.out.print(rats(r,unit,n,arr));
    }
}