package javaTest.enumTest;

public class TestBacisEnum {
	//1.����ö�����͡���ʲô������֣���������Ҫ�е�Ԫ�ء��涨�ռ䡿��
	public enum MType{SAY_YES,SAY_NO};

	public static void main(String[] args) {
		//2.�õ�ö�����͵�ʵ������ͨ��mType�������ã�
		MType mType = MType.SAY_YES;
		//3.������ܸ�ö������MTypeΪ�����ĺ����С�
		say(mType);
	}
	
	public static void say(MType say){
		//4.����ö�����ͽ����жϴ���
		if(say == MType.SAY_YES){
			System.out.println("you said : yes ---�� " + say);
		}else if(say == MType.SAY_NO){
			System.out.println("you said : no ---�� " + say);
		}
	}

}
