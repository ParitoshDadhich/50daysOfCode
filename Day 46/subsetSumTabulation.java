public class Solution {
    public int solve(int[] arr, int sum){
        int n = arr.length;
        int t[][] = new int[n+1][sum+1];
        
        // initialization;
        for(int i=0; i<n+1; i++)
            for(int j=0; j<sum+1; j++){
                if(i == 0)
                    t[i][j] = 0;
                if(j == 0)
                    t[i][j] = 1;
            }
        
        // choice tree;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(j >= arr[i-1]){
                    int h1 = t[i-1][j-arr[i-1]];
                    int h2 = t[i-1][j];
                    
                    t[i][j] = h1==1 || h2 == 1 ? 1 : 0;
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        
        return t[n][sum];
    }
}
