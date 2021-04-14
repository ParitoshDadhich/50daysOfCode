class Solution {
    public boolean canPartition(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++)
            sum += arr[i];
        
        // if the sum of the elements is odd then two equal partitions are not possible
        if(sum%2 != 0)
            return false;
        
        // once we got to know sum of elements are even then
        // we need to find only half of sum,
        // the reason is if one half is present then other half would surely be present.
        sum = sum/2;
        
        boolean t[][] = new boolean[n+1][sum+1];
        
        
        for(int i=0; i<n+1; i++)
            t[i][0] = true;
        for(int j=1; j<sum+1; j++)
            t[0][j] = false;
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(j >= arr[i-1])
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        }
        
        return t[n][sum];
    }
}
