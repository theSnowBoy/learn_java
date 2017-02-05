package algorithmTest.basic.easy_2;

public class NumberComplement {
	public int findComplement(int num) {
		String bin_src = Integer.toBinaryString(num);
		char[] src = bin_src.toCharArray();
		for (int i = 0; i < bin_src.length(); i++) {
			if (src[i] == '1') {
				src[i] = '0';
			} else if (src[i] == '0') {
				src[i] = '1';
			}
		}
		int tgt = Integer.parseInt(String.valueOf(src).trim(), 2);
		return tgt;
	}

	public static void main(String[] args) {
		System.out.println(new NumberComplement().findComplement(5));
	}
}
