public class Solution {
    public int solve(int[] A, int B) {
        int t[][] = new int[A.length+1][B+1];
        
        for(int i=0; i<A.length+1; i++)
            for(int j=0; j<B+1; j++)
                t[i][j] = -1;
                
        return helper(A, B, A.length, t);
    }
    
    private int helper(int arr[], int sum, int n, int t[][]){
        if(sum == 0)
            return 1;
        else if(n <= 0)
            return 0;
        
        if(t[n][sum] != -1)
            return t[n][sum];
        
        
        int h1 = 0;
        if(arr[n-1] <= sum){
            int t1 = helper(arr, sum-arr[n-1], n-1, t);
            int t2 = helper(arr, sum, n-1, t);
            
            return t[n][sum] = (t1==1 || t2==1 ? 1:0);
        }
        return t[n][sum] = helper(arr, sum, n-1, t);
    }
}
