
class Solution{
    static int equalPartition(int n, int arr[])
    {
        int sum = 0;
        for(int i: arr)
            sum += i;
        
        if(sum%2 != 0)
            return 0;
        
        sum = sum/2;
        int t[][] = new int[n+1][sum+1];
        
        for(int i=0; i<n+1; i++)
            for(int j=0; j<sum+1; j++)
                t[i][j] = -1;
        
        return helper(arr, sum, n, t);
    }
    
    private static int helper(int arr[], int sum, int n, int t[][]){
        if(sum == 0)
            return 1;
        else if(n <= 0)
            return 0;
        
        if(t[n][sum] != -1)
            return t[n][sum];
        
        int c1 = 0;
        if(arr[n-1] <= sum)
            c1 = helper(arr, sum-arr[n-1], n-1, t);
        int c2 = helper(arr, sum, n-1, t);
        
        return t[n][sum] = (c1==1 || c2==1) ? 1 : 0;
    }
}
