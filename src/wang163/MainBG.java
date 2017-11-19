package wang163;

import java.util.Scanner;

public class MainBG {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextLine()){
		String BG = sc.nextLine();
		int count1 = count(BG,'G');
		int count2 = count(BG,'B');
		System.out.println(count1 < count2 ? count1:count2);
	}
}
public static int count(String BG,char front){
	int count = 0;
	int frontNum = 0;
	for(int i = 0;i < BG.length();i++){
		if(BG.charAt(i) == front){
			frontNum++;
		}else{
			count += frontNum;
		}
	}
	return count;
}
}
