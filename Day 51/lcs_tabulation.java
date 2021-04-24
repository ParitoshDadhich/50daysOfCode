class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int x = s1.length();
        int y = s2.length();
        
        int t[][] = new int[x+1][y+1];
        
        for(int i=0; i<x+1; i++)
            t[i][0] = 0;
        
        for(int i=0; i<y+1; i++)
            t[0][i] = 0;
            
        for(int i=1; i<x+1; i++){
            for(int j=1; j<y+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else 
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        
        return t[x][y];
    }
}
