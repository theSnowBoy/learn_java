package javaTest.collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListModifyTest {

	public static void main(String[] args) {
		
	}
	
	private static void testChangeReadOnly(){
		////1.创建2个list。并且这2个list的访问权限未进行设置。
		List<StringBuilder> modifyList = new ArrayList<>(); 
		List<StringBuilder> normalList= new LinkedList<>();
		//2.向modifylist中插入元素。
		modifyList.add(new StringBuilder("you"));
		modifyList.add(new StringBuilder("are"));
		modifyList.add(new StringBuilder("boy"));
		//3.设置可读权限
		modifyList = Collections.unmodifiableList(modifyList);
		//4.将只读的modifyList中的引用复制到normalList中。
		normalList.addAll(modifyList);
		//5.向normalList中插入数据。
		normalList.add(new StringBuilder("hello"));
		System.out.println(normalList.toString());
		
		//6.更改只读list中，引用所指向的对象的值。
		System.out.println("更改之前 ----> " + modifyList.toString());
		//更改
		modifyList.get(1).append("~~~~~");
		System.out.println("更改之后 ----> " + modifyList.toString());
	}
	
	private static void testReadOnly(){
		//1.创建一个list。并且这个list的访问权限未进行设置。
		List<String> modifyList = new ArrayList<>(); 
		//2.向其中插入相关的数据。【可行】
		modifyList.add("you");
		modifyList.add("are");
		modifyList.add("boy");
		//3.对list进行设置。使之可读。
		modifyList = Collections.unmodifiableList(modifyList);
		//4.在次插入，出现错误。
		modifyList.add("hello");
	}
	private static void testArray(){
		
	}

}
