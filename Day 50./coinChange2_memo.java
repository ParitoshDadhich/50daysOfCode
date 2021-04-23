class Solution
{
    public long count(int coins[], int size, int sum) 
    { 
        long t[][] = new long[size+1][sum+1];
        
        for(int i=0; i<size+1; i++)
            for(int j=0; j<sum+1; j++)
                t[i][j] = -1;
        
        return helper(coins, size, sum, t);
    } 
    
    private static long helper(int coins[], int size, int sum, long t[][]){
        if(sum == 0)
            return 1;
        if(size == 0)
            return 0;
            
        if(t[size][sum] != -1)
            return t[size][sum];
            
        int c1 = 0;
        if(coins[size-1] <= sum)
            return t[size][sum] = helper(coins, size, sum-coins[size-1], t) + helper(coins, size-1, sum, t);
        else
            return t[size][sum] = helper(coins, size-1, sum, t);
    }
}
