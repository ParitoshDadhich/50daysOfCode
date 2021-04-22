class Solution {
    public int change(int amount, int[] coins) {
        int sum = amount;
        int m = coins.length;
        int t[][] = new int[m+1][sum+1];
        
        for(int i=0; i<sum+1; i++)
            t[0][i] = 0;
            
        for(int i=0; i<m+1; i++)
            t[i][0] = 1;
            
        for(int i=1; i<m+1; i++){
            for(int j=1; j<sum+1; j++){
                if(coins[i-1] <= j)
                    t[i][j] = t[i][j-coins[i-1]] + t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        }
        
        return t[m][sum];
    }
}
