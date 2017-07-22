package algorithmTest.basic.easy_5;

public class ReverseString2 {
    public String reverseStr(String s, int k) {
    	int start,end;
    	char[] sArray = s.toCharArray();
    	for(int i =0;i < sArray.length; i += 2*k){
    		start =i;
    		end = (start + k -1) < sArray.length -1 ? (start + k -1):(sArray.length -1);
    		reverseChar(sArray, start, end);
    	}
        return String.valueOf(sArray);
        
    }
    
    public void reverseChar(char[] s,int start,int end){
    	while(start < end){
    		char tmp = s[start];
    		s[start] = s[end];
    		s[end] = tmp;
    		start++;
    		end--;
    	}
    }
}
