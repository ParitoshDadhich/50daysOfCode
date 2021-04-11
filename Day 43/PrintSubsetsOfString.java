package questions;

public class PrintSubsetsOfString {

	public static void main(String[] args) {
		printSubsets("abc", "");
	}

	private static void printSubsets(String str, String op) {
		if(str.length() == 0) {
			System.out.println(op);
			return;
		}
		
		String op1 = op;
		String op2 = op + str.charAt(0);
		
		printSubsets(str.substring(1), op1);
		printSubsets(str.substring(1), op2);
		
		return;
	}

}
