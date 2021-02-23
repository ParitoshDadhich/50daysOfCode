package binaryTree;

import java.util.*;

public class BinaryTreeUse {

	// TAKE INPUT USING RECURSION
	public static binaryTreeNode<Integer> takeInput(Scanner sc){
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		
		if(rootData == -1) return null;
		
		binaryTreeNode<Integer> root = new binaryTreeNode<Integer>(rootData);
		root.left = takeInput(sc);
		root.right = takeInput(sc);
		
		return root;
	}
	
	// PRINT DATA USING RECURSION
	public static void printTree(binaryTreeNode<Integer> root) {
		// this is a base case 
		// in case of generic tree it is not a base case, it was edge case;
		if(root == null) return;
		
		String toBePrinted = root.data + "";
		if(root.left != null)
			toBePrinted += "L: " + root.left.data + ", ";
		
		if(root.right != null)
			toBePrinted += "R: " + root.right.data;
		
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}

	
	
	// TAKE INPUT LEVEL WISE;
	public static binaryTreeNode<Integer> takeInputLevelWise(){
		Queue<binaryTreeNode<Integer>> queue = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data");
		int rootData = sc.nextInt();
		if(rootData == -1) return null;
		
		binaryTreeNode<Integer> root = new binaryTreeNode<>(rootData); 
		queue.add(root);
		
		while(!queue.isEmpty()) {
			binaryTreeNode<Integer> front = queue.remove();
			
			// taking left child input;
			System.out.println("Enter the left child of " + front.data );
			int leftChild = sc.nextInt();
			if(leftChild != -1) {
				binaryTreeNode<Integer> child1 = new binaryTreeNode<Integer>(leftChild);
				front.left = child1;
				queue.add(child1);
			}
			
			// taking right child input;
			System.out.println("Enter the right child of " + front.data);
			int rightChild = sc.nextInt();
			if(rightChild != -1) {
				binaryTreeNode<Integer> child2 = new binaryTreeNode<Integer>(rightChild);
				queue.add(child2);
				front.right = child2;
			}
		}
		
		return root;
	}
	
	// PRINT DATA LEVEL WISE;
	public static void printTreeLevelWise(binaryTreeNode<Integer> root) {
		Queue<binaryTreeNode<Integer>> queue = new ArrayDeque<>();
		
		queue.add(root);
		while(!queue.isEmpty()) {
			
			binaryTreeNode<Integer> front = queue.remove();
			String toBePrinted = front.data + ":";
			
			if(front.left != null) {
				toBePrinted += "L" + front.left.data + ", ";
				queue.add(front.left);
			}
			
			if(front.right != null) {
				toBePrinted += "R" + front.right.data;
				queue.add(front.right);
			}
			
			System.out.println(toBePrinted);
		}
		
	}
	
	
	public static int countNodes(binaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		
		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);
		
		return ans;
	}
	
	// TIME O(N2)
	public static int diameterOfBinaryTree(binaryTreeNode<Integer> root) {
		if(root == null) return 0;
		
		// when two deepest nodes are present in left sub tree and right sub tree respectively;
		int option1 = height(root.left) + height(root.right);
		
		// when two deepest nodes are present in left sub tree only;
		int option2 = diameterOfBinaryTree(root.left);
		
		// when two deepest nodes are present in right sub tree only;
		int option3 = diameterOfBinaryTree(root.right);
		
		return Math.max(option1, Math.max(option2, option3));
	}
	
	public static int height(binaryTreeNode<Integer> root) {
		if(root == null) return 0;
		
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	
	// TIME O(N)
	 
	private static Pair diameterByPair(binaryTreeNode<Integer> root) {
		if(root == null) {
			Pair ans = new Pair();
			ans.height = 0;
			ans.diameter = 0;
			return ans;
		}
		
		Pair ans = new Pair();
		
		Pair leftOutput = diameterByPair(root.left);
		Pair rightOutput = diameterByPair(root.right);
		
		int option1 = leftOutput.height + rightOutput.height;
		int option2 = leftOutput.diameter;
		int option3 = rightOutput.diameter;
		
		ans.height = Math.max(leftOutput.height, rightOutput.height) + 1;
		ans.diameter = Math.max(option1, Math.max(option2, option3));
		
		return ans;	
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		binaryTreeNode<Integer> root = takeInput(sc);
		binaryTreeNode<Integer> root = takeInputLevelWise();
		printTreeLevelWise(root);
		//diameterOfBinaryTree(root);
		System.out.println("Diameter: " + diameterByPair(root).diameter + ", height: " + diameterByPair(root).height);
		//sc.close();

	}

}
