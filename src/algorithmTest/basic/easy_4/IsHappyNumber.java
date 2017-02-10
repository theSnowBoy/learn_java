package algorithmTest.basic.easy_4;

import java.util.HashSet;

public class IsHappyNumber {
	public boolean isHappy(int n) {
		if(n == 1) return true;
		HashSet<Integer> set = new HashSet<Integer>();
		int sum = n;
		set.add(sum);
		while(sum != 1){
			char[] data = String.valueOf(sum).toCharArray();
			sum = 0;
			for(int i =0;i <data.length;i++){
				sum += (data[i] - '0')*(data[i] - '0'); 
			}
			if(set.contains(sum)){
				return false;
			}else{
				set.add(sum);
			}
		}
		return true;
	}
}
