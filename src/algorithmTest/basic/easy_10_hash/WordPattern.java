package algorithmTest.basic.easy_10_hash;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null){
        	return false;
        }
        
        String[] words = str.split(" ");
        if(pattern.length() != words.length){
        	return false;
        }
        
        Map<Character, String> map =  new HashMap<>();
        for(int i = 0; i < pattern.length();i++){
        	if(map.containsKey(pattern.charAt(i))){
        		//compare
        		if(!map.get(pattern.charAt(i)).equals(words[i])){
        			return false;
        		}
        	}else{
        		//insert key - value;
        		if(map.containsValue(words[i])){
        			return false;
        		}
        		map.put(pattern.charAt(i), words[i]);
        	}
        }
        return true;
    }
}
