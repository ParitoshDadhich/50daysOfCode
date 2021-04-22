package questions;

import java.util.Arrays;

public class CountOfSubsetsWithAGivenSum_Memo {

	public static void main(String[] args) {
		int arr[] = {2,3,7,8,10};
		System.out.println(countSubsets(arr, 11));

	}
	
	private static int countSubsets(int arr[], int sum) {
		
		int n = arr.length;
		int t[][] = new int[n+1][sum+1];
		
		for(int i=0; i<n+1; i++)
			for(int j=0; j<sum+1; j++)
				t[i][j] = -1;
		
		return helper(arr, sum, n, 0, t);
	}

	private static int helper(int[] arr, int sum, int n, int count, int t[][]) {
		if(sum == 0) {
			count++;
			return count;
		}
		
		else if(n == 0)
			return count;
		
		if(t[n][sum] != -1)
			return t[n][sum];
 
		int c1 = 0;
		if(arr[n-1] <= sum)
			c1 = helper(arr, sum-arr[n-1], n-1, count, t);
		int c2 = helper(arr, sum, n-1, count, t);
		
		return t[n][sum] = c1+c2;
	}
}
