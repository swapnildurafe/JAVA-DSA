class WaterBottle2{
    public static int maxBottleDrunk(int numBottles, int numExchange){
        int result = numBottles;
        int emptyBottles = numBottles;
        while(emptyBottles >= numExchange){
            emptyBottles = emptyBottles - numExchange;
            result = result + 1;
            emptyBottles = emptyBottles + 1;
            numExchange= numExchange + 1;
        }
        return result;
    }

    public static void main(String[] args){
        int numBottles = 13;
        int numExchange = 6;
        System.out.println(maxBottleDrunk(numBottles, numExchange));
    }
}