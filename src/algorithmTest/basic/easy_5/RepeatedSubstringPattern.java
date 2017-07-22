package algorithmTest.basic.easy_5;

public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		char[] array = s.toCharArray();
		boolean isAllRepeated = false;
		
		for (int interval = 1; interval <= len / 2; interval++) {
			
			if (len % interval == 0) {
				boolean isOneRepeated = true;
				int count = len / interval;
				for (int i = 0; i < interval; i++) {
					for (int j = 0; j < count; j++) {
						isOneRepeated = isOneRepeated && (array[i] == array[i + j * interval]);
					}
				}
				isAllRepeated = isAllRepeated || isOneRepeated;
			}
		}
		return isAllRepeated;
	}
}
