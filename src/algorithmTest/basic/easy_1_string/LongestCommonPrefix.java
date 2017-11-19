package algorithmTest.basic.easy_1_string;

public class LongestCommonPrefix {
	//TODO 
	public String longestCommonPrefix(String[] strs) {
        //1.求最小的字符串长度。
        int min = strs[0].length();
        for(String str : strs){
            min = min <= str.length() ? min : str.length(); 
        }
        //2.顺次比较。
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < min ;i++){
            char current = '\0' ;
            for(int j = 0; j < strs.length;j ++){
                if(j == 0){
                    current = strs[j].charAt(i);
                    continue;
                }
                
                if(current != strs[j].charAt(i)){
                    current = '\0';
                    break;
                }
                
            }
            if(current == '\0'){
                break;
            }
            sb.append(current);
        }
        return sb.toString();
    }
}
