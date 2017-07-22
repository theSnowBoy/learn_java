package school_recruit;

public class MonoSum {
    public int calcMonoSum(int[] A, int n) {
        // write code here
    	if(n <= 1) return 0;
    	int[] f = new int[n];
    	int momoSum = 0;
    	
       	for(int i =0;i <n; i++){
       		for(int j = i-1;j >= 0;j--){
       			if(A[i] >= A[j]){
       				 f[i] += A[j]; 				
       			} 
       		}
    		
    	}
       	
     	for(int i =0;i <n; i++){
     		momoSum += f[i];
     	}
     	return momoSum;
    }

}
