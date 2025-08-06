
// Input:
// Move#Hash#to#Front
// Output:
// ###MoveHashtoFront
import java.util.*;
class MovehashForward{

    public static void move(String str){

        String chr = "";
        String hash = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '#'){
                chr = chr + str.charAt(i);
            }
            else{
                hash = hash + str.charAt(i);
            }
        }
        String result = chr.concat(hash);
        System.out.print(result);
    }

    public static void main(String[] args){
        String str = "abcd##ef##g";
        move(str);
    }
}