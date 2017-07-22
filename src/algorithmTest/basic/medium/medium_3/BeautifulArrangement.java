package algorithmTest.basic.medium.medium_3;

public class BeautifulArrangement {

	public static int countArrangement(int N) {
		boolean[] invites = new boolean[N];
		return find(0,invites,N);
	}
	
	public static  int find(int pos,boolean[] invites,int N){
		if(pos == N) return 1;
		int sum = 0;
		for(int nums =0;nums < N;nums++){
			if(!invites[nums] && ((nums+1) % (pos+1) == 0 || (pos+1) % (nums+1) == 0)){
				invites[nums] = true;
				sum += find(pos+1,invites,N);
				invites[nums] = false; //×´Ì¬»¹Ô­
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countArrangement(3));
	}

}
