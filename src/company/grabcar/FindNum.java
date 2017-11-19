package company.grabcar;

import java.util.Set;
import java.util.TreeSet;

public class FindNum {
	public int solution(int[] A) {
		//��������Ļ����жϡ����� ���� 0��
		//�������飬��ʶ���ʵ��������boolean��
		//����A,��������з���״̬����S��
		//ע���1��ʼ��
		//���±�1��ʼ�������ҵ���Ϊ0�ĵ�һ����
		Set<Integer> exits = new TreeSet<>();
		for(int i = 0; i < A.length;i++){
			if(A[i] > 0){
				exits.add(A[i]); 
			}
		}
		
		int memo = 1;
        for(Integer cur : exits){
        	if(memo == cur){
        		memo++;
        	}
        }
        return memo;
    }
}
