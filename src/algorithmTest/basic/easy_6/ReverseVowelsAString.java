package algorithmTest.basic.easy_6;

public class ReverseVowelsAString {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int low = 0,high = array.length -1;
        boolean isLowVow  = false, isHighVow = false;
        String vowels = "aeiouAEIOU";
        
        while(low < high){
        	isLowVow = (vowels.indexOf(array[low]) != -1);
        	isHighVow = (vowels.indexOf(array[high]) != -1);
        	if(isHighVow && isLowVow){
        		char tmp = array[low];
        		array[low] = array[high];
        		array[high] = tmp;
        		low++;
        		high--;
        	}else{
        		if(!isLowVow){
        			low++;
        		}
        		if(!isHighVow){
        			high--;
        		}
        	}
        }
        return String.valueOf(array);
    }
}
