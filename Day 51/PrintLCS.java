package questions;

public class PrintLCS {

	public static void main(String[] args) {
		System.out.println(helper("acbcf", "abcdaf"));
	}
	
	private static String helper(String s1, String s2) {
		
		int n = s1.length();
		int m = s2.length();
		int t[][] = new int[n+1][m+1];
		for(int i=0; i<n+1; i++)
			t[i][0] = 0;
		
		for(int i=0; i<m+1; i++)
			t[0][i] = 0;
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1))	// when characters are common;
					t[i][j] = 1 + t[i-1][j-1];
				else
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);	// when characters are not common;
			}
		}
		
		int i=n, j=m;
		String ans = "";
		while(i>0 || j>0) {		// loop will be keep on running until either s1 or s2 or both will become empty strings
			 if(s1.charAt(i-1) == s2.charAt(j-1)) {
				 ans += s1.charAt(i-1);
				 i--;
				 j--;
			 }
			 else {
				 if(t[i-1][j] > t[i][j-1])
					 i--;
				 else
					 j--;
			 }
		}
		
		String s="";
		int l = ans.length();
		for( i=l-1; i>=0; i--)
			s += ans.charAt(i);
		
		return s;
	}

}
