package algorithmTest.basic.easy_5;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        char[] array = word.toCharArray();
        int capitalCount = 0;
        boolean isFirstCapital = (array[0]<'a');
        for(char letter : array){
        	if(letter < 'a'){
        		capitalCount++;
        	}
        }
        return (capitalCount == word.length() || capitalCount == 0 || (capitalCount == 1 && isFirstCapital))? true:false;
    }
}
