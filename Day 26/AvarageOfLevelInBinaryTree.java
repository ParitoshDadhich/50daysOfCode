class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        
        que.add(root);
        que.add(null);
        int sum = 0;
        int count = 0;
        
        while(!que.isEmpty()){
            TreeNode node;
            
            if(que.peek() != null){
                node = que.remove();
                
                sum += node.val;
                count++;
                
                if(node.left != null)
                    que.add(node.left);
                if(node.right != null)
                    que.add(node.right);
                
            } else{
                que.remove();
                list.add((1.0*sum/count));
                sum = 0;
                count = 0;
                
                if(que.isEmpty())
                    break;
                else
                   que.add(null);
            }
        }
        
        return list;
    }
}
