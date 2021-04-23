
class GFG {
    public int cutRod(int price[], int n) {
        int length[] = new int[n];
        for(int i=0; i<n; i++)
            length[i] = i+1;
            
        return helper(price, length, 0, n, n);A
    }
    
    private static int helper(int price[], int length[], int sum, int n, int size){
        if(size == 0)
            return sum;
        if(size <= 0 || n <= 0)
            return 0;
            
        int p1 = 0;
        if(length[n-1] <= n)
            p1 = helper(price, length, sum+price[n-1], n, size-length[n-1]);
        
        int p2 = helper(price, length, sum, n-1, size);
        
        return Math.max(p1, p2);
    }
}
