package algorithmTest.basic.easy_4;

import java.util.Arrays;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		char[] arrayNote = ransomNote.toCharArray();
		char[] arrayMagazine = magazine.toCharArray();
		Arrays.sort(arrayNote);
		Arrays.sort(arrayMagazine);
		int position=0;
		int note_position1;
		for(note_position1 =0;note_position1 <arrayNote.length && position <arrayMagazine.length;){
			while(position < arrayMagazine.length){
				if(arrayMagazine[position] == arrayNote[note_position1]){
					position++;
					note_position1++;
					break;
				}
				position++;
			}
		}
		if(position <= arrayMagazine.length && note_position1 == arrayNote.length){
			return true;
		}
		return false;
	}
}
