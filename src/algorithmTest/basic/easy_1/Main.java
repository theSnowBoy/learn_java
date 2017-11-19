package algorithmTest.basic.easy_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String line = in.nextLine();

			getResult(line);
		}
	}

	public static void getResult(String line) {
		int count = 0;
		int countR = 0;
		
		for(int i = 0; i < line.length();i++){
			if(line.charAt(i) == 'R'){
				countR++;
			}else if(countR > 0 && line.charAt(i) == 'L'){
				countR = 1;
			}else if(countR == 0 && line.charAt(i) == 'L'){
				count ++;
			}
		}
		System.out.println(count + countR);
	}
}
