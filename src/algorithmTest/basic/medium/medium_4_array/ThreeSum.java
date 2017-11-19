package algorithmTest.basic.medium.medium_4_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        //1.排序。
    	Arrays.sort(nums);
    	//2.选取c（不同于上次所选）,然后 寻找a,b 满足 a + b = -c。
    	//3.a,b,c记录放入的集合S.(如何做到不重复放入呢？规定次序：只能在c的右边空间中寻找)
    	List<List<Integer>> results = new ArrayList<>();
    	
    	int c = 0;
    	for(int i = 0 ; i < nums.length ; i++){
    		if(i == 0){
    			c = nums[i];
    		}else if(nums[i] == c){
    			continue;
    		}else{
    			c = nums[i];
    		}
    		
    		for(int p1 = i+1,p2= nums.length -1 ;p1 < p2;){
    			if(nums[p1] + nums[p2] + c == 0){
    				//TODO 加入结果集中。
    				List<Integer> result = new ArrayList<>(3);
    				result.add(c);
    				result.add(nums[p1]);
    				result.add(nums[p2]);
    				results.add(result);
    				while(p1 < p2 && nums[p1] == nums[++p1]){ // 这里出现了一些bug,注意。
    				}
    				while(p1 < p2 && nums[p2] == nums[--p2]){
    				}
    			}else if(nums[p1] + nums[p2] + c < 0){
    				p1++;
    				
    			}else if(nums[p1] + nums[p2] + c > 0){
    				p2--;
    			}
    		}
    	}
    	return results;
    }
    public static void main(String[] args) {
    	int[] data = new int[]{-1,0,1,2,-1,-4};
		System.out.println(threeSum(data));
	}
}
