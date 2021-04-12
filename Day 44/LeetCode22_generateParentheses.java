class Solution {
    public List<String> generateParenthesis(int n) {
        int open = n;
        int close = n;
        List<String> list = new ArrayList<>();
        helper("", open, close, list);
        return list;
    }
    
    private void helper(String op, int open, int close, List<String> list){
        if(open == 0 && close == 0){
            list.add(op);
            return;
        }
        
        if(open == close)
            helper(op + '(', open-1, close, list);
        
        else if(open == 0)
            helper(op + ')', open, close-1, list);
        
        else if(open < close){
            helper(op + '(', open-1, close, list);
            helper(op + ')', open, close-1, list);
        }
        
        return;
    }
}
