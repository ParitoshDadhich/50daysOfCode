package questions;

import java.util.*;

public class SortKSortedArray {
	
	public static void main(String[] args) {
		int arr[] = {2,4,1,9,6,8};
		sortKSorted(arr, 3);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	
	// size of a priorityQueue is always k, because every time we will be adding and removing elements from the pq;
	// time o(nlogk); we will be performing logk operations to all n elements so time would be nlogk;
	public static void sortKSorted(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i = 0;
		int l = arr.length;
		// add elements till k, by doing so we are making a 
		// small min heap with k elements;
		for(; i<k; i++)
			pq.add(arr[i]);
		
		// now do removing and adding operation in order to
		// sort the array;
		for(; i<l; i++) {
			arr[i-k] = pq.remove();
			pq.add(arr[i]);
		}
		
		for(int j=l-k; j<l; j++)
			arr[j] = pq.remove();
	}
	
}
