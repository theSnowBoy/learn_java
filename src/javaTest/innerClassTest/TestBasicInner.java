package javaTest.innerClassTest;

public class TestBasicInner {
	private static String outerStr = "**hello outer**";

	public static void main(String[] args) {
		Inner.show();
	}
	
	public static class Inner{
		public static void show(){
			System.out.println("the outer string is : " + outerStr);
		}
	}

}
