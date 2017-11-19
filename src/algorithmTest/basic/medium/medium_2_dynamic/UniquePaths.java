package algorithmTest.basic.medium.medium_2_dynamic;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
    	if(m == 0 || n == 0){
    		return 0;
    	}
        int results[][] = new int[m][n];
        results[0][0] = 1;
        for(int i = 0 ; i < m ; i++){
        	for(int j= 0; j < n; j++){
        		if(i > 0){
        			results[i][j] += results[i-1][j]; 
        		}
        		if(j > 0){
        			results[i][j] += results[i][j-1];
        		}
        	}
        }
        return results[m-1][n-1];
    }
}
