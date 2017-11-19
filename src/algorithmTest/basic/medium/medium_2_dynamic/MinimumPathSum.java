package algorithmTest.basic.medium.medium_2_dynamic;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		if (grid == null) {
			return 0;
		}
		int rows = grid.length;
		int cols = grid[0].length;
		
		int fromUp = 0,fromLeft = 0;
		for (int i = 0; i <= rows-1; i++) {
			for (int j = 0; j <= cols-1; j++) {
				fromUp = Integer.MAX_VALUE;
				fromLeft = Integer.MAX_VALUE;
				
				if (i >0 ) {
					fromLeft = grid[i][j] + grid[i-1][j] ;
				} 
				if(j > 0){
					fromUp = grid[i][j] + grid[i][j-1];
				}
				if(i != 0 || j!= 0){
					grid[i][j] = fromLeft < fromUp ? fromLeft : fromUp;
				}
			}
		}
		return grid[rows-1][cols-1];
	}
}
