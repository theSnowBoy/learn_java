package algorithmTest.dynamic;

public class UniqueBinarySearchTrees {
	 public int numTrees(int n) {
	        //¿¨ÌØÀ¼Êı
	        long result = 1;
	        for(int i = 0; i < n;i++){
	            result *= (2*n - i);
	        }
	        for(int i = 0;i < n;i++){
	            result /= (n-i);
	        }
	        int r = Integer.parseInt(String.valueOf(result));
	        return r;
	    }
	 public static void main(String[] args) {
		int data = 7;
		System.out.println(data & 0xFFFFFFFF);
	}
}
