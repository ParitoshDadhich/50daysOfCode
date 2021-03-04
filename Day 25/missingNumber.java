class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0; i<n; i++)
            actualSum += arr[i];
        
        int ans = 0;
        if(actualSum != expectedSum)
            ans = Math.abs(expectedSum - actualSum);
        
        return ans;
    }
}
