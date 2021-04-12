class Solution{
    
    ArrayList<String> permutation(String str){
        ArrayList<String> list = new ArrayList<>();
        String op = str.charAt(0)+"";
        return helper(str.substring(1), op, list);
    }
    
    private ArrayList<String> helper(String str, String op, ArrayList<String> list){
        if(str.length() == 0){
            list.add(op);
            return list;
        }
            
        // not include with space
        String op1 = op + str.charAt(0);
        // include with space
        String op2 = op + " " + str.charAt(0);
        
        list = helper(str.substring(1), op2, list);
        list = helper(str.substring(1), op1, list);
        
        return list;
        
    }
    
}
