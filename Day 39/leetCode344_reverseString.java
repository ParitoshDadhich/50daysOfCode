class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        for(int i=0; i<j; i++,j--){
            char ch = s[j];
            s[j] = s[i];
            s[i] = ch;
        }
    }
}
