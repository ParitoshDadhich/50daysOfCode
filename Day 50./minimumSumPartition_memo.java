class Solution
{

	public int minDiffernce(int arr[], int n) 
	{ 
	    int sum = 0;
	    for(int i: arr)
	        sum += i;
	    
	    int t[][] = new int[n+1][sum+1];
	    for(int i=0; i<n+1; i++)
	        for(int j=0; j<sum+1; j++)
	            t[i][j] = -1;
	    
	    return helper(arr, sum, n, 0, t);
	} 
	
	private int helper(int arr[], int sum, int n, int cal, int t[][]){
	    if(n == 0){
	        return Math.abs((sum-cal)-cal);
	    }
	    
	    if(t[n][cal] != -1)
	        return t[n][cal];
	    
	    int s1 = helper(arr, sum, n-1, cal+arr[n-1], t);
	    int s2 = helper(arr, sum, n-1, cal, t);
	    
	    return t[n][cal] = Math.min(s1, s2);
	}
}
