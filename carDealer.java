// A function is there which tells how many dealerships there are and the total number of cars in each dealership.
// Your job is to calculate how many tyres would be there in each dealership.

// Input
// 3                                    There are total 3 dealerships

// 4 2                                 dealerships1 contains 4 cars and 2 bikes

// 4 0                                 dealerships2 contains 4 cars and 0 bikes

// 1 2                                 dealerships3 contains 1 cars and 2 bikes

//                                     Total number of tyres in dealerships1  is (4 x 4) + (2 x 2) = 20

//                                     Total number of tyres in dealerships2 is (4 x 4) + (0 x 2) = 16

//                                     Total number of tyres in dealerships3 is (1 x 4) + (2 x 2) = 8

// Output

// 20
// 16
// 8
import java.util.*;
class carDealer{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int dealership = sc.nextInt();
        while(dealership > 0){
            int cars = sc.nextInt();
            int bikes = sc.nextInt();
            System.out.println(cars*4 + bikes*2);
            dealership--;
        }
    }
}