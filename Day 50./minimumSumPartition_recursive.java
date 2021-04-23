
class Solution
{

	public int minDiffernce(int arr[], int n) 
	{ 
	    int sum = 0;
	    for(int i: arr)
	        sum += i;
	    
	    return helper(arr, sum, n, 0);
	} 
	
	private int helper(int arr[], int sum, int n, int cal){
	    if(n == 0){
	        return Math.abs((sum-cal)-cal);
	    }
	    
	    int s1 = helper(arr, sum, n-1, cal+arr[n-1]);
	    int s2 = helper(arr, sum, n-1, cal);
	    
	    return Math.min(s1, s2);
	}
}
