
class GFG {
    public int cutRod(int price[], int n) {
        int size = price.length;
        int length[] = new int[n];
        int t[][] = new int[size+1][n+1];
        
        for(int i=0; i<n; i++)
            length[i] = i+1;
        
        for(int i=0; i<size+1; i++)       
            t[i][0] = 0;
            
        for(int i=0; i<n+1; i++)
            t[0][i] = 0;
            
        for(int i=1; i<size+1; i++){
            for(int j=1; j<n+1; j++){
                if(length[i-1] <= j)
                    t[i][j] = Math.max(price[i-1] + t[i][j-length[i-1]], t[i-1][j]);
                else
                    t[i][j] = t[i-1][j];
            }
        }
        
        return t[size][n];
    }
}
