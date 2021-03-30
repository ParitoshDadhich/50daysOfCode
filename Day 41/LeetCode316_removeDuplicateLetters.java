class Solution {
    public String removeDuplicateLetters(String s) {
        int l = s.length();
        int freq[] = new int[26];   // frequency array;
        boolean isAdded[] = new boolean[26];
        LinkedList<Character> res = new LinkedList<>();
        
        for(char ch: s.toCharArray())
            freq[ch-'a']++;
        
        for(char ch: s.toCharArray()){
            freq[ch-'a']--;
            
            if(isAdded[ch-'a'])
                continue;
            
            while(!res.isEmpty() && res.getLast() > ch && freq[res.getLast()-'a'] > 0){
                isAdded[res.getLast()-'a'] = false;
                res.removeLast();
            } 
            res.add(ch);
            isAdded[ch-'a'] = true;
        }
        String ans = "";
        while(!res.isEmpty())
            ans += res.remove();
        
        return ans;
    }
}
