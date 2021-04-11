class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        helper(nums, 0, list, output);
        
        return output;
    }
    
    private void helper(int arr[], int sI, List<Integer> list, List<List<Integer>> output){
        if(arr.length == sI ){
            output.add(new ArrayList<Integer>(list));
            return;
        }
        
        // leave first element;
        helper(arr, sI+1, list, output);
        // add first element
        list.add(arr[sI]);
        helper(arr, sI+1, list, output);
        // remove last element in list in order to backtrack
        list.remove(list.size()-1);
        
        return;
    }
}
