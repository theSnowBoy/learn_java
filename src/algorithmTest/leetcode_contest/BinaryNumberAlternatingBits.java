package algorithmTest.leetcode_contest;

public class BinaryNumberAlternatingBits {
    public boolean hasAlternatingBits(int n) {
    	String binary = Integer.toString(n, 2);
    	
    	char pre = binary.charAt(0);
    	for(int i =1 ;i < binary.length();i++){
    		if(pre != binary.charAt(i)){
    			pre = binary.charAt(i);
    		}else{
    			return false;
    		}
    	}
    	return true;
    }
}
