class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0)
            return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int output = 0;
        
        for(int i: nums){
            if(map.containsKey(i)){
                if(k == 0 && map.get(i) == 1)
                    output++;
                
                map.put(i, map.get(i)+1);
            } else{
                if(map.containsKey(i-k))
                    output++;
                if(map.containsKey(i+k))
                    output++;
                
                map.put(i, 1);
            }
        }
        
        return output;
    }
}
