package algorithmTest.basic.medium;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int rear = 0, front = 0, max = 0;
		String sub = "";

		while (front < s.length() - 1) {
			sub = s.substring(rear, front);

			if (sub.length() > max)
				max = sub.length();

			int rear_add = -1;
			front++;
			// 判断出现的位置。没有返回-1.有返回其index.
			if (front < s.length() - 1) {
				rear_add = sub.indexOf(String.valueOf(s.charAt(front)));
			}

			rear = rear + rear_add + 1;
		}
		return max;
	}

	public static void main(String[] args) {
		String test1 = "abcabcbb";
		// String test1 = "au";
		// String test1 = "bbbbb";
		LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(ls.lengthOfLongestSubstring(test1));
	}
}
