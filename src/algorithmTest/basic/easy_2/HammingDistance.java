package algorithmTest.basic.easy_2;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
		int max = x > y ? x:y;
		int min = x > y ? y:x;
		
		String str_max = Integer.toBinaryString(max);
		StringBuilder str_min = new StringBuilder(Integer.toBinaryString(min));
		int diff = str_max.length() - str_min.length();
		for(int i = 0;i<diff;i++){
			str_min.insert(0,"0");
		}
		int hammingDistance = 0;
		for(int j =0;j<str_max.length();j++){
			if(str_max.charAt(j)!= str_min.charAt(j)){
				hammingDistance ++;
			}
		}
		return hammingDistance;
	}
}
