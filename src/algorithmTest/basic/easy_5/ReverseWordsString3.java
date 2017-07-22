package algorithmTest.basic.easy_5;

public class ReverseWordsString3 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder results = new StringBuilder();
        
        for(String word : words){
        	char[] restult = word.toCharArray();
        	
        	for(int i = 0 ; i <restult.length/2 ; i++ ){
        		char tmp = restult[i];
        		restult[i] = restult[restult.length - 1 - i];
        		restult[restult.length - 1 - i] = tmp;
        	}
        	results.append(String.valueOf(restult)).append(" ");
        }
        
        if(results.lastIndexOf(" ") == -1){
        	return results.toString();
        }else{
        	 return results.substring(0, results.lastIndexOf(" ")).toString();
        }
    }
}
