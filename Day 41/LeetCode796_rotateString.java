class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()) return false;
        
        StringBuilder str = new StringBuilder();
        for(char ch: A.toCharArray())
            str.append(ch);
        
        for(char ch: A.toCharArray()){
            if(A.equals(B))
                return true;
            else{
                str.append(ch);
                String s = str.toString();
                str.deleteCharAt(0);
                A = str.toString();
            }
        }
        
        String s = str.toString();
        return s.equals(B)?true:false;
    }
}
