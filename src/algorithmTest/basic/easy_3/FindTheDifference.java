package algorithmTest.basic.easy_3;

public class FindTheDifference {
	public char findTheDifference(String s, String t) {
		int all_s = 0, all_t = 0;
		for (int i = 0; i < s.length(); i++) {
			all_s += (int) s.charAt(i);
		}
		for (int i = 0; i < t.length(); i++) {
			all_t += (int) t.charAt(i);
		}
		return (char)(all_t - all_s);
	}
}
