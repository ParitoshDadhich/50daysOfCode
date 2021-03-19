import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

    	System.out.println(Solution.countBracketReversals(br.readLine().trim()));

    }
}


import java.util.*;

public class Solution {

	public static int countBracketReversals(String str) {
		Stack<Character> stack = new Stack<>();
        
        int l = str.length();
        if(l%2!=0) return -1;
        int count = 0;
        
        for(int i=0;i<l; i++){
            char ch = str.charAt(i);
            if(ch == '{')
                stack.push(ch);
            else{
                if(!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(ch);
            }
                
        }
        
        while(!stack.isEmpty()){
            char ch1 = stack.pop();
            char ch2 = stack.pop();
            if(ch1 == ch2)
                count++;
            else
                count += 2;
        }
        
        return count;
	}

}
