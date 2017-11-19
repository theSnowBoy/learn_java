package huawei;

import java.util.Scanner;

public class CutStringBy8 {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	while(sc.hasNextLine()){
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		cut(str1);
		cut(str2);
	}
	}
public static void cut(String str){
	if(str == null){
		return;
	}
	int current = 0;
	for(int i = 0;i < str.length();i++){
		System.out.print(str.charAt(i));
		if(++current == 8){
			System.out.println();
			current = 0;
		}
	}
	if(current == 0){
		return;
	}
	for(int i = 0; i < 8 - current;i++){
		System.out.print('0');
	}
	System.out.println();
	
}
}
