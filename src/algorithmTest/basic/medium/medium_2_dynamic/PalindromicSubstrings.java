package algorithmTest.basic.medium.medium_2_dynamic;

public class PalindromicSubstrings {
    public static int countSubstrings(String s) {
    	int length = s.length();
        int[][] paliSign = new int[length][length];
        int sum = 0;
        
        sum += length;
        for(int i =0;i < length;i++){
        	paliSign[i][i] = 1;
        	if(i != length -1 && s.charAt(i) == s.charAt(i+1)){
        		paliSign[i][i+1] = 1;
        		sum += 1;
        	}
        }
                
        for(int gap =0; gap <= length-2;gap++){
        	for(int i = 1; i <= length-gap-2; i++){
        		if(paliSign[i][i+gap] == 1 && s.charAt(i-1)== s.charAt(i+gap+1)){
        			paliSign[i-1][i+gap+1]=1;
        			sum += 1;
        		}
        	}
        }

        return sum;
    }
    
    public static void main(String[] args) {
		System.out.println(countSubstrings("aaa"));
	}
}
