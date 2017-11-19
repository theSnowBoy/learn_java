package algorithmTest.basic.medium.medium_2_dynamic;

public class UniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] results) {
    	if(results == null || results.length == 0 || results[0].length == 0){
    		return 0;
    	}
    	
    	int m = results.length,n = results[0].length;
        if(m == 1 && n == 1){
            return results[0][0] == 0 ? 1:0;
        }
        results[0][0] = results[0][0] == 0 ? 1 : 0;
        for(int i = 0 ; i < m ; i++){
        	for(int j= 0; j < n; j++){
        		if(i == 0 && j == 0){
        			continue;
        		}
        		if( results[i][j] == 0){
        		if(i > 0){
        			results[i][j] += results[i-1][j]; 
        		}
        		if(j > 0){
        			results[i][j] += results[i][j-1];
        		}
        	}else{
                    results[i][j] = 0;
                }
        	}
        }
        return results[m-1][n-1];
    }
    public static void main(String[] args) {
    	int[][] results = new int[1][2];
    	results[0][0] = 0;
    	results[0][1] = 0;
		System.out.println(uniquePathsWithObstacles(results));
	}
}
