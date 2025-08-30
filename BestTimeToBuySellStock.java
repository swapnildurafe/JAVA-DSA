class BestTimeToBuySellStock{
    public static int profit_nikal(int[] prices){
        int max_profit = 0;
        int buy_price = prices[0];
        for(int i=0;i<prices.length;i++){
            int current_profit = prices[i] - buy_price;
            if(current_profit > max_profit){
                max_profit = current_profit;
            }
            if(buy_price > prices[i]){
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args){
        int[] price1 = {7,1,5,3,6,4};
        int[] price2 = {7,6,4,3,1};
        System.out.println(profit_nikal(price1));
        System.out.println(profit_nikal(price2));
    }
}