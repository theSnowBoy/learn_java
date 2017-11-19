package algorithmTest.basic.medium.medium_6_union_find;

public class FriendCircles {
	public static int findCircleNum(int[][] M) {
		if(M == null || M.length == 0){
			return 0;
		}
		
		int[] friends =  new int[M.length];
		for(int i = 0; i < friends.length;i++){
			friends[i] = -1;
		}
		
		for(int i = 0; i < M.length; i++){
			for(int j = i ; j < M.length;j++){
				//TODO 初始化 朋友关系。
				if(M[i][j] == 1){
					if(friends[j] == -1){
						friends[j] = i;
					}else{
						int newRoot = find(friends, j);
						friends[friends[i]] = newRoot;
						friends[i] = newRoot;
					}
				}
			}
		}
		
		int result = 0;
		for(int i = 0; i < friends.length; i++){
			if(i == friends[i]){
				result ++;
			}
		}
		return result;
	}
	
	public static int find(int[] friends,int i){
		while(i != friends[i]){
			i = friends[i];
		}
		return i;
	}
	public static void main(String[] args) {
		int data[][] = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
		System.out.println(findCircleNum(data));
	}
}
