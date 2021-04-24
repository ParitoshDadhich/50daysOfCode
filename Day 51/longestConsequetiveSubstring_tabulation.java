class Solution{
    int longestCommonSubstr(String s1, String s2, int n, int m){
        int t[][] = new int[n+1][m+1];
        
        for(int i=0; i<n+1; i++)
            t[i][0] = 0;
        
        for(int i=0; i<m+1; i++)
            t[0][i] = 0;
            
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = 0;
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=1; i<n+1; i++)
            for(int j=1; j<m+1; j++)
                if(max < t[i][j])
                    max = t[i][j];
                    
        return max;
    }
}
