package algorithmTest.basic.easy_4;

public class IsPowerOfThree {
	public static boolean isPowerOfThree(int n) {
		String threeForm = Integer.toString(n, 3);
		char[] result = threeForm.toCharArray();
		if(threeForm.charAt(0)=='1'){
			for(int i = 1;i <threeForm.length();i++){
				if(threeForm.charAt(i) != '0'){
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static void main(String args[]){
		int a=27;
		System.out.println(isPowerOfThree(a));
		
	}
}
