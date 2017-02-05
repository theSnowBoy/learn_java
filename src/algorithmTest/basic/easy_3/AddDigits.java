package algorithmTest.basic.easy_3;

public class AddDigits {
	public int addDigits(int num) {
		if(num == 0)return 0;
		int sum = num;
		while(!(sum>=1 && sum<=9)){
			num = sum;
			sum = 0;
			while(num != 0){
				sum += num%10;
				num = num/10;
				
			}
		}
		return sum;
	}
	
	public int addDigits2(int num){
		return (int) (num - 9* Math.floor((num-1)/9));
	}
	public static void main(String args[]){
		System.out.println(new AddDigits().addDigits(10));
	}
}
