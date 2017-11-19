package contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			String[] data = str.split(" ");
			int n = Integer.valueOf(data[0]);
			int m = Integer.valueOf(data[1]);
			List<String> strList = new ArrayList(n);
			for(int i = 0 ; i < n; i++){
				strList.add(in.nextLine());
			}
			//转化为字符矩阵。
			char[][] matrix = getMatrix(strList, n, m);
			//发现各自的位置
			int startX = -1,startY = -1;
			int boxX = -1,boxY = -1;
			int targetX = -1,targetY = -1;
			for(int i =0;i < n;i++){
				for(int j =0;j < m;j++){
					if(matrix[i][j]=='S'){
						startX = i;
						startY = j;
					}else if(matrix[i][j]=='0'){
						boxX = i;
						boxY = j;
					}else if(matrix[i][j]=='E'){
						targetX = i;
						targetY = j;
					}
				}
			}
			
			//出发到找到箱子最小。
			int findBox = getMinSteps(matrix,startX, startY, boxX, boxY, n, m);
			if(findBox == -1){
				System.out.println(-1);
			}else{
				//从箱子到目的地最小化。
				int findTarget = getMinSteps(matrix,boxX, boxY, targetX, targetY, n, m);
				if(findTarget == -1){
					System.out.println(-1);
				}else{
					System.out.println(findBox + findTarget +1);
				}
			}
	}
	
	public static char[][] getMatrix(List<String> data,int n ,int m){
		char[][] result  = new char[n][m];
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < m ;j ++){
				result[i][j] = data.get(i).charAt(j);
			}
		}
		return result;
	}

	public static int getMinSteps(char[][] matrix,int startX,int startY,int endX,int endY,int n,int m){
		if(startX < 0 || startY < 0 || startX >= n || startY >= m || matrix[startX][startY]== '#' || matrix[startX][startY] == 'V'){
			return -1;
		}
		if(startX == endX  && startY == endY){
			return 0;
		}
		
		int ways[] = new int[4];
		char preState = matrix[startX][startY];
		matrix[startX][startY] = 'V';//表示已访问
		ways[0] = getMinSteps(matrix,startX +1,startY,endX,endY,n, m);
		ways[1] = getMinSteps(matrix ,startX -1, startY, endX, endY, n, m);
		ways[2] = getMinSteps(matrix,startX, startY+1, endX, endY, n, m);
		ways[3] = getMinSteps(matrix,startX, startY-1, endX, endY, n, m);
		matrix[startX][startY] = preState;
		int result = Integer.MAX_VALUE;
		for(int i = 0; i < 4;i++){
			if(ways[i] >= 0 && result > ways[i]){
				result = ways[i];
			}
		}
		return result == Integer.MAX_VALUE ? -1 : result+1;
	}
}
