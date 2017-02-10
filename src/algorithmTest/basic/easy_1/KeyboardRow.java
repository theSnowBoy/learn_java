package algorithmTest.basic.easy_1;

import java.util.ArrayList;

public class KeyboardRow {
	String rule1 = "qQwWeErRtTyYuUiIoOpP";
	String rule2 = "asdfghjklASDFGHJKL";
	String rule3 = "zxcvbnmZXCVBNM";
	public String[] findWords(String[] words) {
		ArrayList<String> results = new ArrayList<>();
		String cmp;
		for(String word : words){
			cmp = getRule(word.charAt(0));
			boolean canAdd = true;
			for(int i = 1;i<word.length();i++){
				if(cmp.indexOf(word.charAt(i)) == -1){
					canAdd = false;
					break;
				}
			}
			if(canAdd){
				results.add(word);
			}
			
		}
		String data[] = new String[results.size()];
		
		return results.toArray(data);
	}
	public String getRule(char first){
		if(rule1.indexOf(first) != -1){
			return rule1;
		}else if (rule2.indexOf(first) != -1){
			return rule2;
		}else if(rule3.indexOf(first) != -1){
			return rule3;
		}
		return null;
	}
}
