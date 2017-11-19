package wang163;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int count = sc.nextInt();
			int[] jobs = new int[count];
			for(int i = 0;i <count;i++){
				jobs[i] = sc.nextInt(); 
			}
			
			Arrays.sort(jobs);
			int sum1=0,sum2 = 0;
			for(int i = count-1;i >= 0;i--){
				if(sum1 < sum2){
					sum1 += jobs[i];
				}else{
					sum2 += jobs[i];
				}
			}
			System.out.println(sum1 > sum2 ? sum1 : sum2);
		}
	}
}
