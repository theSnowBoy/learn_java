package algorithmTest.basic.medium;

public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		int i,j;
		for(i=0,j=0;i < s.length() && j < t.length();){
			if(s.charAt(i) == t.charAt(j)){
				i++;
				j++;
			}else{
				j++;
			}
		}
		if(i == s.length()){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
