class Solution
{
    public long count(int coins[], int size, int sum) 
    { 
        return helper(coins, size, sum);
    } 
    
    private static long helper(int coins[], int size, int sum){
        if(sum == 0)
            return 1;
        if(size == 0)
            return 0;
            
        int c1 = 0;
        if(coins[size-1] <= sum)
            return helper(coins, size, sum-coins[size-1]) + helper(coins, size-1, sum);
        else
            return helper(coins, size-1, sum);
    }
}
