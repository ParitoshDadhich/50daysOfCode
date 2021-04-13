class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        helper(arr, 0, sum, N, list);
        
        Collections.sort(list);
        return list;
    }
    
    private static void helper(ArrayList<Integer> arr, int sI, int sum, int n, ArrayList<Integer> list){
        if(sI == n){
            list.add(sum);
            return;
        }
        
        int s1 = sum;
        int s2 = sum + arr.get(sI);
        
        helper(arr, sI+1, s1, n, list);
        helper(arr, sI+1, s2, n, list);
        
        return;
    }
}
