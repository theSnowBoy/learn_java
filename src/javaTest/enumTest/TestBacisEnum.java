package javaTest.enumTest;

public class TestBacisEnum {
	//1.定义枚举类型。（什么类的名字，类型中需要有的元素【规定空间】）
	public enum MType{SAY_YES,SAY_NO};

	public static void main(String[] args) {
		//2.得到枚举类型的实例。（通过mType进行引用）
		MType mType = MType.SAY_YES;
		//3.传入接受该枚举类型MType为参数的函数中。
		say(mType);
	}
	
	public static void say(MType say){
		//4.根据枚举类型进行判断处理。
		if(say == MType.SAY_YES){
			System.out.println("you said : yes ---》 " + say);
		}else if(say == MType.SAY_NO){
			System.out.println("you said : no ---》 " + say);
		}
	}

}
