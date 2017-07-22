package algorithmTest.basic.medium.medium_1;

public class ReconstructQueue {
	//类似于 冒泡法 + 插入排序。
	public static int[][] reconstructQueue(int[][] people) {
		if(people.length < 2) return people;
		int h_tmp = 0;
		int k_tmp= 0;
		
		for(int i = 0;i < people.length;i++){
			for(int j = people.length-1;j > i;j--){
				if(people[j][0] > people[j-1][0] || (people[j][0] == people[j-1][0] && people[j][1]<people[j-1][1])){
					//交换
					h_tmp = people[j][0];
					k_tmp = people[j][1];
					people[j][0] = people[j-1][0];
					people[j][1] = people[j-1][1];
					people[j-1][0] = h_tmp;
					people[j-1][1] = k_tmp;
				}
			}
			//插入排序
			int step = i;
			for(int k = i-people[i][1];k > 0; k--){
				//交换
				h_tmp = people[step][0];
				k_tmp = people[step][1];
				people[step][0] = people[step-1][0];
				people[step][1] = people[step-1][1];
				people[step-1][0] = h_tmp;
				people[step-1][1] = k_tmp;
				step--;
			}
		}
		return people;
	}
	
	public static void main(String[] args) {
		int people[][] ={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		System.out.println(reconstructQueue(people));
	}
	
}
