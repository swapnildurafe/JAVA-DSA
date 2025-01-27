import java.util.*;
public class rotate_array {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr , int k) 
    {
        int n = arr.size();
        k= k%n;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=k;i<n;i++)
        {
            res.add(arr.get(i));
        }
        for(int i=0;i<k;i++)
        {
            res.add(arr.get(i));
        }
        return res;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
int k = 2;
System.out.println(rotateArray(arr, k));
    }
}
