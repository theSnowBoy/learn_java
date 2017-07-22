package algorithmTest.basic.easy_6;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
    	if(s.equals("")) return 0;
    	char[] array = s.toCharArray();
    	int len = array.length;
    	boolean isPreSpace = true;
    	int count = 0;
    	
    	for(int i = len-1; i >= 0 ;i--){
    		
    		if(isPreSpace){
    			if(! (array[i] == ' ')){
    				count =1;
    			}
    		}else{
    			if((array[i] == ' ')){
                    break;
    			}
                count ++;
    		}
    		isPreSpace = (array[i] == ' ');
    	}
    	return count;
    }
}
