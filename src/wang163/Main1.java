package wang163;

import java.util.Scanner;

import org.jdom2.transform.XSLTransformer;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int count = sc.nextInt();
			int[] x = new int[count];
			int[] y = new int[count];
			for(int i = 0 ; i < count;i++){
				x[i] = sc.nextInt();
			}
			sc.nextLine();
			for(int i = 0 ; i < count;i++){
				y[i] = sc.nextInt();
			}
			
			System.out.print(0);
			for(int i = 2 ; i < count;i++){
				System.out.println(" ");
				minSteps(count, x, y, i);
			}
			System.out.println();
		}
	}
	
	public static void minSteps(int count,int[] x,int[] y,int k){
		
		int start = 0;
		int end = k-1;
		int steps = 0;
		for(int i = 1;i < k;i++){
			steps += x[i]-x[i-1]+y[i]-y[i-1];
		}
		int tmpSteps = steps;
		//1.选移动的k 个点。
		for(int i = k;i<count;i++){
			tmpSteps = tmpSteps + x[i]-x[i-1]+y[i]-y[i-1]-(x[i-k+1]-x[i-k]+y[i-k+1]-y[i-k]);
			if(tmpSteps < steps){
				steps = tmpSteps;
				start = i-k+1;
				end = i;
			}
		}
		
		//2.在k个点中计算最小步数。
		int xsteps = 0;
		int ysteps = 0;
		for(int i = start+1; i <= end ; i++){
			xsteps += x[i] - x[i-1];
			ysteps += y[i] - y[i-1];
		}
		int middleX = x[start] + xsteps/2;
		int middleY = y[start] + ysteps/2;
		steps = 0;
		for(int i = start;i <= end;i++){
			steps += Math.abs(x[i]-middleX) + Math.abs(y[i] - middleY);
		}
		
		System.out.print(steps);
	}
}
