package algorithmTest.basic.easy._1;

/*
 * 回文数
 */
public class PalindromeNumber {
	//使用字符串的方法。
	 public boolean isPalindrome(int x) {
		 if(x< 0) return false;
	        char data[] = String.valueOf(x).toCharArray();
	        int middle = data.length/2;
	        for(int i = 0 ; i <= middle;i++){
	        	//对称判断
	        	if(data[i] != data[data.length-1-i]){
	        		return false;
	        	}
	        }
	        return true;
	    }
	 //使用数字的方法。
	 public boolean isPalindrome2(int x) {
		    if (x<0 || (x!=0 && x%10==0)) return false;
		    int rev = 0;
		    while (x>rev){
		    	rev = rev*10 + x%10;
		    	x = x/10;
		    }
		    return (x==rev || x==rev/10);
		}
}
