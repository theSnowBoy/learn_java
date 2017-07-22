package algorithmTest.basic.easy_6;

public class ValidPalindrome {
	/**
	 * 1.先变为小写。
	 * 2.转为字符数组。
	 * 3.判断是否为小写字母： 97 <= 小写字母 <= 122， 48 <= 数字 <=57
	 * 4.双指针判断
	 */
	public boolean isPalindrome(String s) {
		char[] array = s.toLowerCase().toCharArray();
		
		int low =0 , high =array.length -1;
		boolean result = true;
		while(low < high){
			boolean isLowLetter = (array[low] >= 97 && array[low] <= 122) || 
					(array[low] >= 48 && array[low] <= 57);
			boolean isHighLetter = (array[high] >= 97 && array[high] <= 122) ||
					(array[high] >= 48 && array[high] <= 57);
			if(isHighLetter && isLowLetter){
				result = result && (array[low] == array[high]);
				low ++;
				high --;
			}else{
				if(!isHighLetter){
					high --;
				}
				if(!isLowLetter){
					low ++;
				}
				
			}
			
		}
		return result;
	}
}
