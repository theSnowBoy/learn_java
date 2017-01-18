package algorithmTest.basic.easy._1;

/*
 * ������
 */
public class PalindromeNumber {
	//ʹ���ַ����ķ�����
	 public boolean isPalindrome(int x) {
		 if(x< 0) return false;
	        char data[] = String.valueOf(x).toCharArray();
	        int middle = data.length/2;
	        for(int i = 0 ; i <= middle;i++){
	        	//�Գ��ж�
	        	if(data[i] != data[data.length-1-i]){
	        		return false;
	        	}
	        }
	        return true;
	    }
	 //ʹ�����ֵķ�����
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
