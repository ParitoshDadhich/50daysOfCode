public class Solution {
    public int solve(int[] arr, int sum){
        int n = arr.length;
        int t[][] = new int[n+1][sum+1];
        
        for(int i=0; i<n+1; i++)
            for(int j=0; j<sum+1; j++)
                t[i][j] = -1;
        
        return helper(arr, sum, n-1, t);
    }
    
    private static int helper(int arr[], int sum, int n, int t[][]){
        if(sum == 0)
            return 1;
        else if(n == 0)
            return 0;
        
        if(t[n][sum] != -1)
            return t[n][sum];
        
        int h1=-1, h2=-1, h3=-1;
        if(sum >= arr[n-1]){
            h1 = helper(arr, sum-arr[n-1], n-1, t);
            h2 = helper(arr, sum, n-1, t);
            
            t[n][sum] = h1==1 || h2 == 1 ? 1 : 0;
        }
        else
            t[n][sum] = helper(arr, sum, n-1, t);
        
        return t[n][sum];
    }
}
