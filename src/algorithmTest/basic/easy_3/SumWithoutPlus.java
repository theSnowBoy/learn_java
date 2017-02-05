package algorithmTest.basic.easy_3;

public class SumWithoutPlus {
	public int getSum(int a, int b) {
		if(b == 0){
			return a;
		}
		int sum ,carry;
		sum = a^b;
		carry = (a&b)<<1;
		return getSum(sum, carry);
	}
	public int getSum2(int a, int b) {
		int tmp,sum ,carry;
		sum = a^b;
		carry = (a&b)<<1;
		while (carry != 0){
			tmp = sum^carry;
			carry = (sum & carry)<<1; 
			sum = tmp;
		}
		return sum;
	}
}
