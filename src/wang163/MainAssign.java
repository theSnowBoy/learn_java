package wang163;

import java.util.ArrayList;
import java.util.Scanner;


public class MainAssign {
	public static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int n = sc.nextInt();
			sc.nextLine();
			ArrayList<String> data = new ArrayList<>();
			for(int i = 0; i < n;i++){
				data.add(sc.nextLine());
			}
			boolean[] isAssigned = new boolean[7];
			find(data,n,0,isAssigned);
			System.out.println(count);
		}
	}
	
	public static void find(ArrayList<String> data,int n,int person,boolean[] isAssigned){

		String current = data.get(person);
		if(person ==  n-1){
			for(int i = 0;i < current.length();i++){
				if(!isAssigned[current.charAt(i)-'0']){
					count++;
				}
			return;
			}
		}
		for(int i = 0;i < current.length();i++){
			if(isAssigned[current.charAt(i)-'0']){
				continue;
			}
			isAssigned[current.charAt(i)-'0'] = true;
			find(data, n, person + 1, isAssigned);
			isAssigned[current.charAt(i)-'0'] = false;
		}
	}
}
