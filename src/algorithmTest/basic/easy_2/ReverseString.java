package algorithmTest.basic.easy_2;

public class ReverseString {
	public String reverseString(String s) {
		int mid = s.length()/2;
		char[] data= s.toCharArray();
		for(int i = 0;i<mid;i++){
			char tmp = data[i];
			data[i] = data[s.length()-1-i];
			data[s.length()-1-i] = tmp;
		}
		return String.valueOf(data);
	}
}
