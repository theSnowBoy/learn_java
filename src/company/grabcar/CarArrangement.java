package company.grabcar;

public class CarArrangement {
	public int solution(int[] A, int X, int Y, int Z) {
		//初始化
		int[] restTime = new int[3];
		restTime[0] = X;
		restTime[1] = Y;
		restTime[2] = Z;
		int[] servTime = new int[3]; //0:X ; 1:Y ; 2:Z;
		
		int maxWaitTime = 0;
		for(int i = 0; i < A.length;i++){
			//无法终止。
			if(!isEnough(A[i], restTime)){
				return -1;
			}
			//可终止
			int place = findSuitablePlace(A[i], restTime, servTime);
			restTime[place] -= A[i];
			maxWaitTime = (maxWaitTime >= servTime[place])? maxWaitTime :servTime[place];
			servTime[place] += A[i];
		}
		return maxWaitTime;
	}
	public boolean isEnough(int car,int[] restTime){
		for(int i = 0; i < restTime.length;i++){
			if(car <= restTime[i]){
				return true;
			}
		}
		return false;
	}
	public int findSuitablePlace(int car,int[] restTime,int[] servTime){
		int index = 0;
		int minServtime = Integer.MAX_VALUE;
		for(int i = 0 ; i < 3;i++){
			if(car <= restTime[i] && minServtime > servTime[i]){
				minServtime = servTime[i];
				index = i;
			}
		}
		return index;
	}
	public int findMax(int[] time){
		int max = 0; 
		for(int i =0;i < time.length;i++){
			max = (max >= time[i])?max:time[i];
		}
		return max;
	}
}
