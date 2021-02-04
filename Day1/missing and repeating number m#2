class Solve {
    int[] findTwoElement(int arr[], int n) {

// METHOD 2
    // USING EQUATIONS;
    
    int sum_n = (n*(n+1))/2;
    int sum_sq = (n*(n+1)*(2*n+1))/6;
    
    for(int i=0; i<n; i++){
        sum_n -= arr[i];
        sum_sq -= arr[i]*arr[i];
    }
    
    int miss = (int)( sum_n + sum_sq/sum_n )/2;
    int rep = (int)(miss - sum_n);
    
    int ans[] = new int[2];
    ans[0] = rep;
    ans[1] = miss;
        
    return ans;
    
        
    }
}
