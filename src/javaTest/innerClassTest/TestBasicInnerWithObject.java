package javaTest.innerClassTest;

public class TestBasicInnerWithObject {
	private String outerStr = "**hello outer**"; //��static.

	public static void main(String[] args) {
		//1.�����ⲿ����
		TestBasicInnerWithObject outer = new TestBasicInnerWithObject();
		//2.Inner���ǷǾ�̬�ģ�����**�������ⲿ����**���ܴ��ڡ�
		//������д����Inner in = new TestBasicInnerWithObject.Inner();
		//3.�����ڲ������
		Inner in = outer.new Inner();
		//4.�����ڲ���Ĺ���������
		in.show();
		//5.���Կ���˽�з�����
		outer.callInnerPrivate(in);
	}
	
	public void callInnerPrivate(Inner in){
		in.privateShow();
	}
	
	public class Inner{// ��static .
		public void show(){// ��static.
			System.out.println("the outer string is : " + TestBasicInnerWithObject.this.outerStr);
		}
		
		private void privateShow(){  //�����˽�з�����
			System.out.println("this is private !!!");
		}
	}
}
