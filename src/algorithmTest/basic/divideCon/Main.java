package algorithmTest.basic.divideCon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {// 注意while处理多个case
			int n = in.nextInt();
			count(n);
		}
	}

	public static void count(int n) {
		int count = 0;
		count += n * n + 2 * (n-1);
		for(int i  = 2; i < n;i++){
			int tmp = i;
			count++;
			
			for(int k = 1; k < n;k++){
				tmp *= i;
				
				if(tmp <= n){
					count++;
				}else{
					break;
				}
			}
		}
		System.out.println(count);
	}
}
