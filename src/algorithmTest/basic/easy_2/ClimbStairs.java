package algorithmTest.basic.easy_2;

public class ClimbStairs {
	public int climbStairs(int n) {
		if( n == 0) return 1;
		if(n == 1) return 1;
		int num1 = climbStairs(n -1);
		int num2 = climbStairs(n-2);
		return num1 +num2;
	}
}
