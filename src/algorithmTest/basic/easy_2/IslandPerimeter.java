package algorithmTest.basic.easy_2;

public class IslandPerimeter {
	/*
	 *错误的做法。（认识不够深刻） 
	 */
	public int islandPerimeter(int[][] grid) {

		int length = grid[0].length;
		int width = grid.length/length;
		int count = 0;
		for(int i = 0;i<length;i++){
			for(int j =0;j<length;j++){
				if(grid[i][j] == 1){
					int up1 = -1;
					int down1 = -1;
					int left = -1;
					int right =-1;
					
					if (i != 0){
						up1 = i-1;
					}
					if(i != width-1){
						down1 =i+1;
					}
					if(j != 0 ){
						left = j -1;
					}
					if(j != length -1){
						right =j+1; 
					}
					
					if(left == -1){
						count ++;
					}else if(grid[i][left] == 0){
						count ++;
					}
					
					if(right == -1){
						count ++;
					}else if(grid[i][right]== 0){
						count ++;
					}
					
					if(up1 == -1){
						count ++;
					}else if (grid[up1][j]== 0){
						count ++;
					}
					
					if(down1 == -1){
						count ++;
					}else if (grid[down1][j] == 0){
						count ++;
					}
					
				}
			}
		}
		return count;
	}
}
