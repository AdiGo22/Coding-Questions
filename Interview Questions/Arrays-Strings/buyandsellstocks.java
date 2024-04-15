public class buyandsellstocks {
    //leetcode121
    public int maxprofit(int[]prices){ 
    //to find max profit
    int max_profit =0;
    int min_value = Integer.MAX_VALUE;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<min_value){
            min_value = prices[i];
        }else if(prices[i]-min_value>max_profit){
            max_profit = prices[i]-min_value;//updated
        }
    }
    return max_profit;
}
}
