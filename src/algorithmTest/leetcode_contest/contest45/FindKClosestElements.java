package algorithmTest.leetcode_contest.contest45;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindKClosestElements {
    public static List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
    	
    	LinkedList<Integer> results = new LinkedList<>();
    	int i = 0;
        for(; i < arr.size();i++){
        	if(arr.get(i) > x){
        		break;
        	}
        }
        if(i != 0){
        	i--;//指向小的。
        }
        
        int p1 = i;
        int p2 = i+1;
        while(k >0){
        	if( p1>= 0 && p2 < arr.size() ){
        		//注意 ： 需要用绝对值判断。
        		if(Math.abs(arr.get(p1)- x) <= Math.abs(arr.get(p2) - x)){
        			results.addFirst(arr.get(p1--));
        			k--;
        		}else{
        			results.addLast(arr.get(p2++));
        			k--;
        		}
        	}else if(p1 >= 0){
        		results.addFirst(arr.get(p1--));
    			k--;
        	}else if(p2 < arr.size()){
        		results.addLast(arr.get(p2++));
    			k--;
        	}
        }
        return results;
    }
    public static void main(String[] args) {
    	List<Integer> arr = new ArrayList<>();
    	arr.add(0);
    	arr.add(0);
    	arr.add(0);
    	arr.add(1);
    	arr.add(3);
    	arr.add(5);
    	arr.add(6);
    	arr.add(7);
    	arr.add(8);
    	arr.add(8);
    	findClosestElements(arr, 2, 2);
	}
}
