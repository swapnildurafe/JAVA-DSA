import java.util.*;
class FractionToDecimal{
    public static String FtoD(int numerator, int denominator){
        if(numerator == 0) return "0";
        StringBuilder result = new StringBuilder();
        if( (numerator > 0) ^ (denominator > 0) ){
            result.append("-");
        }
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        result.append(num/den);
        long remainder = num % den;
        if(remainder == 0){
            return result.toString();
        }
        result.append(".");

        Map<Long,Integer> rmMAp = new HashMap<>();
        while(remainder != 0){
            if(rmMAp.containsKey(remainder)){
                int startIndex = rmMAp.get(remainder);
                result.insert(startIndex,"(");
                result.append(")");
                break;
            }
            rmMAp.put(remainder,result.length());

            remainder = remainder * 10;
            result.append(remainder/den);   
            remainder = remainder % den;
        }
        return result.toString();
    }

    public static void main(String[] args){
        int numerator = 10;
        int denominator = 1;
        
        int numerator1 = 4;
        int denominator2 = 333;

        System.out.println(FtoD(numerator,denominator));
        System.out.println(FtoD(numerator1,denominator2));
    }
}