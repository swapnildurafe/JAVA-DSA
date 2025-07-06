import java.util.*;

public class Calc_ratios {
    public static plusMinus(List<Integer> arr)
    {
        int n= arr.size();
        int positive_count=0;
        int negative_count=0;
        int zero_count=0;
        for(int i=0;i<n;i++)
        {
            int num = arr.get(i);
            if(i>0)
            {
                positive_count++;
            }
            else if(i<0)
            {
                negative_count++;
            }
            else
            {
                zero_count++;
            }

            double ps_number =(double) positive_count /n;
            double ng_number =(double) negative_count /n;
            double z_number =(double) zero_count /n;

            System.out.printf("%.6f%n",ps_number);
            System.out.printf("%.6f%n",ng_number);
            System.out.printf("%.6f%n",z_number);

        }
    }

}
