package algorithmTest.basic.medium.medium_1;

public class StringRotation {
	public String rotateString(String A, int n, int p) {
		// write code here
		if(p<0 || p >= n) return A;
		StringBuilder sb = new StringBuilder();
		sb.append(A.substring(p+1, n-1));
		sb.append(A.substring(0, p+1));
		return sb.toString();
	}
}
