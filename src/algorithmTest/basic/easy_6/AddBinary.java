package algorithmTest.basic.easy_6;

public class AddBinary {
	public String addBinary(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        StringBuilder sb =  new StringBuilder();
        int highA = a.length() -1;
        int highB = b.length() -1;
        
        int pre = 0;
        int numberA = 0;
        int numberB = 0;
        int bitResult = 0;
    
        while(highA >= 0 || highB >= 0 || pre >0){
        	numberA = highA >=0 ? (A[highA] - '0'):0;
        	numberB = highB >= 0 ? (B[highB] - '0'):0;
        	highA --;
        	highB --;
        	
        	bitResult = numberA + numberB + pre;
        	if(bitResult == 0){
        		sb.append('0');
        		pre = 0;
        	}else if(bitResult == 1){
               sb.append('1');
        		pre = 0; 
            }else if(bitResult == 2){
        		sb.append('0');
        		pre = 1;
        	}else{
        		sb.append('1');
        		pre = 1;
        	}
        }
        return sb.reverse().toString();
    }
}
