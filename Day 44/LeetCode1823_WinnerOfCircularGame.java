class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++)
            list.add(i);
        k--;
        int index = 0;
        int ans = -1;
        
        return helper(list, k, index, ans);
    }
    
    private int helper(ArrayList<Integer> list, int k, int index, int ans){
        if(list.size() == 1){
            ans = list.get(0);
            return ans;
        }
        
        index = (index+k)%list.size();
        list.remove(index);
        ans = helper(list, k, index, ans);
        
        return ans;
    }
}
