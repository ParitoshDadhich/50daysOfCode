
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    private static int helper(int x, int y, String s1, String s2, int t[][])
    {
        if(x == 0 || y == 0)
            return 0;
        
        if(t[x][y] != -1)
            return t[x][y];
        
        if(s1.charAt(x-1) == s2.charAt(y-1))
            return t[x][y] = 1 + helper(x-1, y-1, s1, s2, t);
        else
            return t[x][y] = Math.max(helper(x-1, y, s1, s2, t), helper(x, y-1, s1, s2, t));
    }
    
    static int lcs(int x, int y, String s1, String s2){
        int t[][] = new int[x+1][y+1];
        for(int i=0; i<x+1; i++)
            for(int j=0; j<y+1; j++)
                t[i][j] = -1;
                
        return helper(x, y, s1, s2, t);
    }
    
}
