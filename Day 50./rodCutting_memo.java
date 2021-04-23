
class GFG {
    public int cutRod(int price[], int n) {
        int len[] = new int[n];
        for(int i=0; i<n; i++)
            len[i] = i+1;
        
        int size = price.length;
        int t[][] = new int[size+1][n+1];
        
        for(int i=0; i<size+1; i++)
            for(int j=0; j<n+1; j++)
                t[i][j] = -1;
                
        return helper(price, len, size, n, t);
    }
    
    private static int helper(int price[], int len[], int size, int n, int t[][]){
        if(size == 0 || n == 0)
            return 0;
            
        
        if(t[size][n] != -1)
            return t[size][n];
        
        if(len[size-1] <= n)
            t[size][n] = Math.max( price[size-1] + helper(price, len, size, n-len[size-1], t),
                              helper(price, len, size-1, n, t));
        
        else
            t[size][n] = helper(price, len, size-1, n, t);
            
        return t[size][n];
    }
}
