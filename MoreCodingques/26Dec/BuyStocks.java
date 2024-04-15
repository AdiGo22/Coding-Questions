class Solution {
    public static int maxProfit (int[] prices ) {

    //prices -[7,1,5,3,6,4]  o/p = 5
   //lowest cp - maximise the profit

   int cp = prices[0];
   int profit = 0, MaxProfit = 0 ;
   for(int price:prices) {
       cp = Math.min(price,cp); // price is always changing thereby this helps to find least cp
       profit = price - cp; //find profit
       MaxProfit = Math.max(profit,MaxProfit); //maximise the profit
   }
   return MaxProfit;
}

public static void main(String[] args) {
    int[] prices = new int[] {7,1,5,3,6,4};
    System.out.println(maxProfit(prices));
}
}