package company.grabcar;

import java.util.Set;
import java.util.TreeSet;

public class FindNum {
	public int solution(int[] A) {
		//对于数组的基本判断。（空 或者 0）
		//分配数组，标识访问的情况。（boolean）
		//遍历A,整数则进行访问状态保存S。
		//注意从1开始。
		//从下标1开始遍历，找到不为0的第一个。
		Set<Integer> exits = new TreeSet<>();
		for(int i = 0; i < A.length;i++){
			if(A[i] > 0){
				exits.add(A[i]); 
			}
		}
		
		int memo = 1;
        for(Integer cur : exits){
        	if(memo == cur){
        		memo++;
        	}
        }
        return memo;
    }
}
