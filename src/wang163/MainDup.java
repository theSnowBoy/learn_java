package wang163;

import java.util.LinkedList;
import java.util.Scanner;

public class MainDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int count = sc.nextInt();
			int[] data = new int[count];
			for(int i =0;i < count;i++){
				data[i] = sc.nextInt();
			}
			boolean[] exists = new boolean[1001];
			LinkedList<Integer> stack = new LinkedList<>();
			for(int i = count-1 ; i >= 0 ; i--){
				if(!exists[data[i]]){
					stack.push(data[i]);
					exists[data[i]] = true;
				}
			}
			
			System.out.print(stack.pop());
			while(!stack.isEmpty()){
				System.out.print(" ");
				System.out.print(stack.pop());
			}
			System.out.println();
		}
	}
}
