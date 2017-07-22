package algorithmTest.basic.easy_6;

public class NumberSegmentsInString {
	 public static int countSegments(String s) {
		 if(s.equals("")) return 0;
		 String[] results = s.split("\\s+");
		 return results.length;
	    }
	 
	 public static void main(String[] args) {
		System.err.println(countSegments("Hello, my name is John"));
	}
}
