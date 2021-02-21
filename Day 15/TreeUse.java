package trees;

import java.util.Scanner;

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
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TreeNode<Integer> root = takeInput(sc);
		print(root);
		
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		
//		System.out.println(root);
		
		
	}

}
