class Solution{
    static int equalPartition(int n, int arr[])
    {
        int sum = 0;
        for(int i: arr)
            sum += i;
        
        if(sum%2 != 0)
            return 0;
        
        sum = sum/2;
        
        return helper(arr, sum, n);
    }
    
    private static int helper(int arr[], int sum, int n){
        if(sum == 0)
            return 1;
        else if(n == 0)
            return 0;
        
        int c1 = helper(arr, sum-arr[n-1], n-1);
        int c2 = helper(arr, sum, n-1);
        
        return (c1==1 || c2==1) ? 1 : 0;
    }
}
