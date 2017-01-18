package javaTest.innerClassTest;

public class TestBasicInnerWithObject {
	private String outerStr = "**hello outer**"; //非static.

	public static void main(String[] args) {
		//1.创建外部对象。
		TestBasicInnerWithObject outer = new TestBasicInnerWithObject();
		//2.Inner类是非静态的，所以**依赖于外部对象**才能存在。
		//【错误写法】Inner in = new TestBasicInnerWithObject.Inner();
		//3.创建内部类对象。
		Inner in = outer.new Inner();
		//4.调用内部类的公共方法。
		in.show();
		//5.可以看到私有方法。
		outer.callInnerPrivate(in);
	}
	
	public void callInnerPrivate(Inner in){
		in.privateShow();
	}
	
	public class Inner{// 非static .
		public void show(){// 非static.
			System.out.println("the outer string is : " + TestBasicInnerWithObject.this.outerStr);
		}
		
		private void privateShow(){  //对象的私有方法。
			System.out.println("this is private !!!");
		}
	}
}
