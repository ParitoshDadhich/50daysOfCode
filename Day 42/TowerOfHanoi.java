package questions;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		System.out.println("Enter the number of rings");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char s ='A';
		char h = 'B';
		char d = 'C';
		toh(n, s, h, d, 0);
	}

	private static int toh(int n, char s, char h, char d, int count) {
		count++;
		if(n == 1) {
			System.out.println(count + " source: " + s + " destination: " + d);
			return count;
		}
		
		count = toh(n-1, s, d, h, count);
		System.out.println(count + " source: " + s + " destination: " + d);
		count = toh(n-1, h, s, d, count);
		return count;
	}

}
