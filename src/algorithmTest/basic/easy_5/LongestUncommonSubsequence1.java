package algorithmTest.basic.easy_5;

public class LongestUncommonSubsequence1 {
    public int findLUSlength(String a, String b) {
    	if(a.equals(b)) return -1;
    	return Math.max(a.length(), b.length());
    }
}
