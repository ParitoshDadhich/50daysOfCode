class Solution {
    public boolean isPalindrome(String s) {
        char ch[] = s.toCharArray();
        int l = s.length();
        for(int i=0, j=l-1; i<j;){
            if(!Character.isLetterOrDigit(ch[i]))
                i++;
            else if(!Character.isLetterOrDigit(ch[j]))
                j--;
            else if(Character.toLowerCase(ch[i++]) != Character.toLowerCase(ch[j--]))
                return false;
        }
        return true;
    }
}
