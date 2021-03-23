class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        int l = s.length();
        for(int i=0; i<l; i++)
            freq[s.charAt(i)-'a']++;
        for(int i=0; i<l; i++)
            if(freq[s.charAt(i)-'a'] == 1)
                return i;
        
        return -1;
    }
}

