package algorithmTest.basic.easy_3;

import java.util.Arrays;

public class FindContentChildren {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int p_g = g.length -1;
		int p_s = s.length -1;
		int count = 0;
		while(p_g >=0 && p_s >= 0){
			if(g[p_g] <= s[p_s]){
				count ++;
				p_g --;
				p_s --;
			}else{
				p_g --;
			}
		}
		return count;
	}
}
