class Solution
{

	public int minDiffernce(int arr[], int n) 
	{ 
	    int sum = 0;
	    for(int i: arr)
	        sum+= i;
	        
	    boolean t[][] = new boolean[n+1][sum+1];
	    
	    // ith part
	    for(int j=0; j<sum+1; j++)
	        t[0][j] = false;
	        
	    for(int i=0; i<n+1; i++)
	        t[i][0] = true;
	        
	   
	    for(int i=1; i<n+1; i++){
	        for(int j=1; j<sum+1; j++){
	            if(arr[i-1] <= j )
	                t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
	           else
	                t[i][j] = t[i-1][j];
	        }
	    }
	    
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i<=(sum+1)/2; i++)
	        if(t[n][i] == true)
	            list.add(i);
	            
	    int diff = Integer.MAX_VALUE;  
	    n = list.size();
	    for(int i=0; i<n; i++)
	        diff = Math.min(diff, Math.abs(sum-2*list.get(i)));
	   
	    return diff;
	    
	} 
}
