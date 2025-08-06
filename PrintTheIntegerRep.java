// Input :
// 10
// 1 2 3 3 4 1 4 5 1 2
 
// Output :

// 1 occurs 3 times
// 2 occurs 2 times
// 3 occurs 2 times
// 4 occurs 2 times
// 5 occurs 1 times

class PrintTheIntegerRep{

    public static void main(String[] args){

        int[] arr = {1,2,3,3,4,1,4,5,1,2};
        int n = arr.length;
        int k=0;
        int[] newarr = new int[n];
        
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        if(count == 0){
                    newarr[k] = arr[i];
                    k++;
                }
            
        }

        for(int i=0;i<k;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(newarr[i] == arr[j]){
                    count++;
                }
            }
            System.out.printf("%d occurs %d times\n",newarr[i],count);
        }
    }
}