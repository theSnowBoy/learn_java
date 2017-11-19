package algorithmTest.leetcode_contest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class NumberDistinctIslands {
    public int numDistinctIslands(int[][] grid) {
        List<Position> starts = new ArrayList<>();
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length ;i ++){
        	for(int j =0; j < grid[0].length;j++){
        		//TODO ²éÕÒ¹Âµº
        		if(grid[i][j] == 1 && visited[i][j] == 0){
        			starts.add(new Position(i, j));
        			visit(grid,i,j,visited);
        		}
        	}
        }
        Set<Position> toRemove = new HashSet<>();
        for(int i = 0; i < starts.size();i++){
        	for(int j = i +1; j < starts.size();j++){
        		if(findDif(grid, starts.get(i).x, starts.get(i).y,starts.get(j).x, starts.get(j).y)){
        			toRemove.add(starts.get(j));
        		}
        	}
        }
        int result = 0;
        for(Position p1 : starts){
        	if(!toRemove.contains(p1)){
        		result ++;
        	}
        }
        return result;
    }
    
    public void visit(int[][] grid,int x,int y ,int[][] visited){
    	if(grid[x][y] == 0 || visited[x][y]==1){
    		return;
    	}
    	 visited[x][y] = 1;  
         if(x + 1 < grid.length){  
             visit(grid, x+1, y, visited);  
         }  
         if(x -1 >= 0){  
             visit(grid, x-1, y, visited);  
         }  
         if(y + 1 < grid[0].length){  
             visit(grid,x,y+1,visited);  
         }  
         if(y -1 >= 0){  
             visit(grid,x,y-1,visited);  
         }  
    }
    
    public boolean findDif(int[][] grid,int X1,int Y1, int X2,int Y2){
    	int[][] visited = new int[grid.length][grid[0].length];
    	return cmp(grid, visited, X1, Y1, X2, Y2);
    }
    public boolean cmp(int[][] grid,int[][] visited,int X1,int Y1, int X2,int Y2){
    	if(visited[X1][Y1] == 1 && visited[X2][Y2] == 1){
    		return true;
    	}
    	if(grid[X1][Y1] != grid[X2][Y2]){
    		return false;
    	}
    	
    	visited[X1][Y1] = 1;
    	visited[X2][Y2] = 1;
    	
    	boolean result = true;
    	
    	if(X1 -1 >= 0 && X2 -1 >= 0){
    		result &= cmp(grid, visited, X1-1, Y1, X2-1, Y2);
    	}else if(!(X1 - 1 < 0 && X2 -1 < 0)){
    		return false;
    	}
    	
    	if(X1 + 1 < grid.length && X2 + 1 < grid.length){
    		result &= cmp(grid, visited, X1+1, Y1, X2+1, Y2);
    	}else if(!(X1 + 1 >= grid.length && X2 + 1 >= grid.length)){
    		return false;
    	}
    	
    	if(Y1 - 1 >= 0 && Y2 -1 >= 0){
    		result &= cmp(grid, visited, X1, Y1-1, X2, Y2-1); 
    	}else if(!(Y1 - 1 < 0 && Y2 -1 < 0)){
    		return false;
    	}
    	
    	if(Y1+1 < grid[0].length && Y2 +1 < grid[0].length){
    		result &= cmp(grid, visited, X1, Y1+1, X2, Y2+1);
    	}else if(!(Y1+1 >= grid[0].length && Y2 +1 >= grid[0].length)){
    		return false;
    	}
    	return result;
    }
    
    class Position{
    	public int x;
    	public int y;
    	public Position(int x,int y){
    		this.x = x;
    		this.y = y;
    	}
    }
}
