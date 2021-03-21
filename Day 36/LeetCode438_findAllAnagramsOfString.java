class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length();
        int n = s.length();
        
        List<Integer> ans = new ArrayList<>();
        int pFreq[] = new int[26];  // array of size 26 for storing p string alphabhet frequencies;
        int sFreq[] = new int[26]; // array of size 26 for storing s string alphabhet frequencies;
        
        // p = abc
        // making a frequency array inorder to have count of each character;
        for(int i=0; i<m; i++)
            pFreq[p.charAt(i)-'a']++;
        
        
        // s = cbaebabacd
        for(int i=0; i<n; i++){
            sFreq[s.charAt(i)-'a']++;
            
        // decrementing the window size when it excides or becomes equal to p.length() i.e. m;
        if(i>=m)
            sFreq[s.charAt(i-m)-'a']--;
        
        // compare sFreq and pFreq and adding the starting index of anagrams to ans list;
        if(compare(sFreq, pFreq))
            ans.add(i-m+1);
        }
        
        return ans;
    }
    
    private boolean compare(int sArr[], int pArr[]){
        int m = sArr.length;
        int n = pArr.length;
        
        for(int i=0; i<m; i++) // if both  arrays are equal then return true else return false;
            if(sArr[i] != pArr[i]) 
                return false; 
        return true;
    }
}

