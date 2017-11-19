package algorithmTest.basic.easy_10_hash;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
       
        if(s == null || s.length() == 0){
        	return 0;
        }
        
        Set<Character> record =  new HashSet<>();
        int result = 0;
        for(int i = 0; i < s.length();i++){
        	if(record.contains(s.charAt(i))){
        		result ++;
        		record.remove(s.charAt(i));
        	}else{
        		record.add(s.charAt(i));
        	}
        }
        if(record.isEmpty()){
        	return result * 2;
        }else{
        	return result * 2 + 1;
        }
    }
}
