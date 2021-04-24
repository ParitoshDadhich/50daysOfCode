class Solution
{
    public static int shortestCommonSupersequence(String s1,String s2,int m,int n)
    {
        int t[][] = new int[m+1][n+1];
        
        for(int i=0; i<m+1; i++)
            t[i][0] = 0;
        
        for(int i=0; i<n+1; i++)
            t[0][i] = 0;
            
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        
        return m+n-t[m][n];
    }
}
