package algorithmTest.basic.medium.medium_5_backtracking;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.print.attribute.standard.Fidelity;

public class WordSearch {
	private boolean finded = false;
	private boolean visit[][] = null;
	
	//TODO 效率存在问题。
    public List<String> findWords(char[][] board, String[] words) {
    	if(board == null || words == null){
    		return null;
    	}
//    	List<String> results = new LinkedList<>();
    	Set<String> results = new HashSet<>();
    	visit = new boolean[board.length][board[0].length];
        for(String word : words){
        	finded = false;
        	exist(board, word);
        	if(finded){
        		results.add(word);//hash错误。
        	}
        }
        List<String> list = new LinkedList<String>();
        list.addAll(results);
        return list;
    }
    public boolean exist(char[][] board, String word) {
        if(board == null || word == null){
        	return false;
        }
        int rows = board.length;
        int cols = board[0].length;
        
        for(int i =0;i < rows;i++){
        	for(int j =0;j < cols;j++){
        		canFindPath(board, word, i, j, 0);
        		if (finded) {
					return true;
				}
        	}
        }
        return finded;
    }
    public void canFindPath(char[][] board, String word,int x_index,int y_index,int word_index){
    	if(board[x_index][y_index] != word.charAt(word_index) ){
    		return;
    	}
    	if(word_index == word.length()-1){
    		finded =true;
    		return;
    	}
    	visit[x_index][y_index] = true;
    	if(x_index > 0 && !visit[x_index-1][y_index]){
    		canFindPath(board, word, x_index-1, y_index, word_index+1);
    		if(finded){
    			visit[x_index][y_index] = false;
    			return;
    		}
    	}
    	if(x_index < board.length - 1 && !visit[x_index+1][y_index]){
    		canFindPath(board, word, x_index+1, y_index, word_index+1);
    		if(finded){
    			visit[x_index][y_index] = false;
    			return;
    		}
    	}
    	
    	if(y_index > 0 && !visit[x_index][y_index-1]){
    		canFindPath(board, word, x_index, y_index-1, word_index+1);
    		if(finded){
    			visit[x_index][y_index] = false;
    			return;
    		}
    	}
    	if(y_index < board[0].length - 1 && !visit[x_index][y_index + 1]){
    		canFindPath(board, word, x_index, y_index+1, word_index+1);
    		if(finded){
    			visit[x_index][y_index] = false;
    			return;
    		}
    	}
    	visit[x_index][y_index] = false;
    }
}
