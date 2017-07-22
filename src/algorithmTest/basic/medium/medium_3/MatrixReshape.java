package algorithmTest.basic.medium.medium_3;

public class MatrixReshape {
	
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int originR = nums.length;
        int originC = nums[0].length;
        if(originR * originC != r * c) {
        	return nums;
        }
        
        int[][] newNums = new int[r][c];
        int originPos = 0;
        for(int i = 0 ; i < originR; i++){
        	for(int j = 0;j < originC;j++){
        		originPos = i * originC + j;
        		newNums[originPos/c][originPos%c] = nums[i][j];
        	}
        }
        return newNums;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
