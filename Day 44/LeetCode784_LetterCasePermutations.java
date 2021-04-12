class Solution {
    public List<String> letterCasePermutation(String str) {
        List<String> list = new ArrayList<>();
        return helper(str, "", list);
    }
    
    private List<String> helper(String str, String op, List<String> list){
        if(str.length() == 0){
            list.add(op);
            return list;
        }
        
        char ch = str.charAt(0);
        
        // if the character would be a digit then we simply include that character in op string
        if(Character.isDigit(ch))
            list = helper(str.substring(1), op+ch, list);
        
        // otherwise we make two cases first convert the character into lower then into upper respectively
        else{
            list = helper(str.substring(1), op + Character.toUpperCase(ch), list);
            list = helper(str.substring(1), op + Character.toLowerCase(ch), list);
        }        
        return list;
    }
}
