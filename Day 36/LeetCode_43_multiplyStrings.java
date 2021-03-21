class Solution {
    public String multiply(String num1, String num2) {
        
        
        // it is given numbers are non negative;
        int m = num1.length();
        int n = num2.length();
        
        // idea of this question is sloving using multiplication what we use to mulitply
        // in elementary classes;
        
        int arr[] = new int[num1.length()+num2.length()];
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                arr[i+j+1] += mul;
                arr[i+j] += arr[i+j+1]/10;
                arr[i+j+1] = arr[i+j+1]%10;
            }
        }
         
        // here I am using string builder
        // if we append any character in sting using simple concatination then time o(n);
        // but in string builder since strings are mutable then time in appending would be o(1);
        
        StringBuilder sb = new StringBuilder();
        for(int num: arr){
            if(sb.length() == 0 && num == 0)
                continue;
            else
                sb.append(num);
        }
            
    return  sb.length() == 0 ? "0" :sb.toString();
    }
}
