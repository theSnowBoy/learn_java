package algorithmTest.basic.easy_3;

public class ConstructRectangle {
	public int[] constructRectangle(int area) {
		int L = (int) Math.ceil(Math.sqrt(area));
		int out[] = new int[2];
		for(int i = L; i <= area; i++ ){
			if(area%i== 0){
				out[0] = i;
				out[1] = area/i;
				break;
			}
		}
		return out;
	}
	public static void main(String args[]){
		System.out.println(new ConstructRectangle().constructRectangle(1));
	}
}
