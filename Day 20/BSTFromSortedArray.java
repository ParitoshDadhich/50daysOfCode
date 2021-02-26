import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	private static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int arr[] = new int[len];
		if(len>0)
		{
			st = new StringTokenizer(br.readLine());
		}
		for(int i=0;i<len;i++)
		{
		    arr[i]=Integer.parseInt(st.nextToken());
		}
		BinaryTreeNode<Integer> ans = Solution.SortedArrayToBST(arr, len);
		preOrder(ans);
	}

}



public class Solution {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		return helper(arr, 0, n-1);
	}
    
    private static BinaryTreeNode<Integer> helper(int arr[], int sI, int eI){
        if(sI > eI)
            return null;
        
        int mid = (sI+eI)/2;
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = helper(arr, sI, mid-1);
        root.right = helper(arr, mid+1, eI);
        
        return root;
    }
    
}
