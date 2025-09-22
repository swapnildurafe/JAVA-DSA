import java.util.*;
class CountElementsWithMaxFreq{
    public static int countFreq(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int n : nums){
            if(hm.containsKey(n)){
                hm.put(n,hm.get(n)+1);
            }
            else{
                hm.put(n,1);
            }
        }

        int maxFreq = 0;
        for(int freq : hm.values()){
            maxFreq = Math.max(maxFreq,freq);
        }

        int ans = 0;
        for(int freq : hm.values()){
            if(freq == maxFreq){
                ans = ans + maxFreq;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,2,2,1,3,4};
        System.out.println(countFreq(nums));
    }
}