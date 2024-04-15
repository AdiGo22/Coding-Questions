package Recursion.EasyRecursion;

public class CountCoins {
    public static int CountNumberOfCoins (int[] coins ,int n , int sum) {
        // bag of coins with different dominations. choose the coins to make it to the sum.

        //first base case. if the sum is - 0 , there is only one solution
        if(sum == 0) return 1;
        //if sum is less than 0 no solution exist
        if(sum < 0) return  0;
        //if there are no coins and sum is greater than  0 , no solution exist
        if(n <= 0) return 0; 

        else{
            return CountNumberOfCoins(coins, n-1, sum) + CountNumberOfCoins(coins, n, sum- coins[n-1]);
        }
    }
    public static void main(String[] args) {
        int []coins = {1,2,3};
        int n = coins.length;
        int sum =  4;
        System.out.println(CountNumberOfCoins(coins, n, sum));
    }
}
