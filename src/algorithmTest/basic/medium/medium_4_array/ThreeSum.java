package algorithmTest.basic.medium.medium_4_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        //1.����
    	Arrays.sort(nums);
    	//2.ѡȡc����ͬ���ϴ���ѡ��,Ȼ�� Ѱ��a,b ���� a + b = -c��
    	//3.a,b,c��¼����ļ���S.(����������ظ������أ��涨����ֻ����c���ұ߿ռ���Ѱ��)
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
    				//TODO ���������С�
    				List<Integer> result = new ArrayList<>(3);
    				result.add(c);
    				result.add(nums[p1]);
    				result.add(nums[p2]);
    				results.add(result);
    				while(p1 < p2 && nums[p1] == nums[++p1]){ // ���������һЩbug,ע�⡣
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
