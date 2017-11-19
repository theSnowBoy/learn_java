package algorithmTest.basic.medium.medium_2_dynamic;

public class TwoKeysKeyboard {
	
	/*
	 * 写的的太复杂了。看网上的答案。
	 */
    public static int minSteps(int n) {
    	int min[] = new int[n+1];
    	int paste_count[] = new int[n+1];
    	min[1] = 0;
    	paste_count[1] = 0;
    	for(int i = 2;i <= n;i++){
    		min[i] = Integer.MAX_VALUE;
    		for(int j = i-1; j > 0;j--){
    			if((i-j) % j == 0){
    				int situation1 = (i-j)/j +1 +min[j];
    				if(min[i] > situation1){
    					min[i] = situation1;
    					paste_count[i] = j;
    					break;
    				}
    			}
    			
    			if(paste_count[j] != 0 && (i-j)% paste_count[j]==0){
    				int situation2 = min[j] + (i-j)/paste_count[j];
    				if(min[i] > situation2){
    					min[i] = situation2;
    					paste_count[i] = paste_count[j];
    					break;
    				}
    			}
    		}
    	}
        return min[n];
    }
    
    public static void main(String[] args) {
		System.out.println(minSteps(4));
	}
}
