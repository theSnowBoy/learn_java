package lintcode;

public class PalindromeNumber {
    public static boolean palindromeNumber(int num) {
    	String digits = String.valueOf(num);
    	int p1 = 0;
    	int p2 = digits.length()-1;
    	while(p1 < p2){
    		if(digits.charAt(p1) != digits.charAt(p2)){
    			return false;
    		}
    		p1++;
    		p2--;
    	}
    	return true;
    }
    
    public static void main(String[] args) {
		System.out.println(palindromeNumber(23));
	}
}
