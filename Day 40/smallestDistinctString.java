class Solution {
    public String smallestDistinct(String s) {
        String ans = helper(s, "");
        char tempArray[] = ans.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
     
    private String helper(String s, String ans){
        if(s.length() == 0)
            return ans;
        
        if(!ans.contains(s.charAt(0) + ""))
            ans += s.charAt(0);
        
        ans = helper(s.substring(1), ans);
        return ans;
    }
}
