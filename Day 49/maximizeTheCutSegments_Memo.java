class Solution
{
     public int maximizeCuts(int n, int x, int y, int z)
    {
        int arr[] = new int[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        
        int t[][] = new int[4][n+1];
        for(int i=0; i<4; i++){
            for(int j=0; j<n+1; j++)
                t[i][j] = -1;
        }
       int temp = helper(n, arr, 2, 0, t);
       
       return temp;
    }
    
    
    private static int helper(int n, int arr[], int sI, int count, int t[][]){
        if(n == 0)
            return count;
        else if(sI >= arr.length || n < 0)
            return 0;
        
        if(t[sI][n] != -1)
            return t[sI][n];
        
        
        if(sI == 2){
            int t1=0, t2=0, t3=0;    

            t1 = helper(n-arr[sI], arr, sI, count+1, t);
            t2 = helper(n-arr[sI-1], arr, sI-1, count+1, t);
            t3 = helper(n-arr[sI-2], arr, sI-2, count+1, t);
            
            return t[sI][n] = Math.max(t1, Math.max(t2, t3));
        }
        
        else if(sI == 1){
            int t1=0, t2=0;
    
            t1 = helper(n-arr[sI], arr, sI, count+1, t);
            t2 = helper(n-arr[sI-1], arr, sI-1, count+1, t); 
        
            return t[sI][n] = Math.max(t1, t2);
        }
        
        else if(sI == 0){
            return t[sI][n] = helper(n-arr[sI], arr, sI, count+1, t);
        }
        
        return t[sI][n];
    }
}
