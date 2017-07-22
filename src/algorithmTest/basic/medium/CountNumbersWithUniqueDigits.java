package algorithmTest.basic.medium;

public class CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
    	if(n == 0) return 1;
    	if(n == 1) return 10;
    	if(n == 2) return 91;
    	int count =91;
    	int last = 81;
    	for(int i = 3;i < n || i <= 10;i++){
    		last *= 10 + (i - 1);
    		count += last;
    	}
    	return count;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
