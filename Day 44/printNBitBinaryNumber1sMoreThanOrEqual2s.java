
class Solution {
    ArrayList<String> NBitBinary(int n) {
        int ones = 0;
        int twos = 0;
        ArrayList<String> list = new ArrayList<>();
        helper("", ones, twos, n, list);
        
        return list;
    }
    
    private static void helper(String op, int ones, int twos, int n, ArrayList<String> list){
        if(n == 0){
            list.add(op);
            return;
        }
        
        if(ones == twos)
            helper(op+'1', ones+1, twos, n-1, list);
        
        else if(ones > twos){
            helper(op+'1', ones+1, twos, n-1, list);
            helper(op+'0', ones, twos+1, n-1, list);
        }
        
        return;
    }
    
}
