package huawei;

import java.util.Scanner;

public class CharCount {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	while(sc.hasNextLine()){
		String src = sc.nextLine();
		String tgt = sc.next();
		System.out.println(count(src,tgt.charAt(0)));
	}
}
public static int count(String src,char tgt){
	src = src.toLowerCase();
	if(tgt >= 'A' && tgt <= 'Z'){
		tgt = (char) (tgt -32);
	}
	
	int count = 0;
	for(int i = 0;i < src.length();i++){
		if(src.charAt(i) == tgt){
			count ++;
		}
	}
	return count;
}
}
