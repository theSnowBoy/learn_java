package algorithmTest.basic.easy._1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigZag {

	public String convert(String s, int numRows) {

		if (numRows <= 1) {
			return s;
		}
		
		// Map<Integer,List<Character>> record = new HashMap<>(); //��Զ��ԣ���������ݽṹ����ֱ�ۡ�
		List<List<Character>> record = new ArrayList<>(numRows);
		
		// ��ʼ��
		for (int i = 0; i < numRows; i++) {
			if (record.get(i) == null) {
				record.set(i, new ArrayList<Character>());
			}
		}

		// ��ʼ��������
		int position = 0;
		int colum = 0;
		while (position < s.length()) {
			if (colum % (numRows - 1) == 0) {
				
				//����numRows���ַ�
				for (int j = 0; j < numRows; j++) {

					if (!(position < s.length())) {
						break;
					}

					record.get(j).add(s.charAt(position));
					position++;
				}

			} else {

				// ����һ���ַ�
				record.get(numRows - 1 - colum % (numRows - 1)).add(s.charAt(position));
				position++;

			}

			colum++;
		}

		// �����ַ�����
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			List<Character> current = record.get(i);
			for (int j = 0; j < record.get(i).size(); j++) {
				sb.append(current.get(j));
			}
		}
		return sb.toString();
	}
}
