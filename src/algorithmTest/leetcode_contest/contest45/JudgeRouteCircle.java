package algorithmTest.leetcode_contest.contest45;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
    	if(moves == null || moves == ""){
    		return true;
    	}
    	//0ÉÏ£¬1ÏÂ£¬2×ó£¬3ÓÒ
        int[] directions = new int[4];
        for(char ch : moves.toCharArray()){
        	if(ch == 'U'){
        		directions[0]++;
        	}else if(ch == 'D'){
        		directions[1]++;
        	}else if(ch == 'L'){
        		directions[2]++;
        	}else{
        		directions[3]++;
        	}
        	
        }
        return directions[0] == directions[1]&& directions[2] == directions[3];
        
    }
}
