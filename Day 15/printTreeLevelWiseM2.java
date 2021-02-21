package trees;

import java.util.*;

public class TreeUse {

	private static TreeNode<Integer> takeInput(Scanner sc){
		//System.out.println("Enter the root data");
		//Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		System.out.println("Enter the child count of " + rootData);
		int childCount = sc.nextInt();
		
		for(int i=0; i<childCount; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.children.add(child);
		}
		
		return root;
	}

	private static TreeNode<Integer> takeInputLevelWise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = sc.nextInt();
		// creating a queue in order to store nodes of a tree;
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		// add root data to the queue;
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			System.out.println("Enter the number of children of " + frontNode.data);
			int childCount = sc.nextInt();
			for(int i=0; i<childCount; i++) {
				System.out.println("Enter the " + (i+1) + " th child of " + frontNode.data);
				int childData = sc.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				frontNode.children.add(child);
				queue.add(child);
			}
		}
		
		return root;
	}
	
	private static void print(TreeNode<Integer> root) {
		String s = root.data + ": ";
		int size = root.children.size();
		
		// printing every root's data and its children
		for(int i=0; i<size; i++)
			s += root.children.get(i).data + ", ";
		
		System.out.println(s);
		
		// going to every root's children
		for(int i=0; i<size; i++)
			print(root.children.get(i));
	}
	
	private static void printLevelWise(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			String ans = frontNode.data + ": ";
			int size = frontNode.children.size();
			for(int i=0; i<size; i++) {
				ans += frontNode.children.get(i).data + ", ";
				queue.add(frontNode.children.get(i));
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(sc);
		
		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
		
		
		
	}

}
