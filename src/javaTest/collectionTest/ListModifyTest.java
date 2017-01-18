package javaTest.collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListModifyTest {

	public static void main(String[] args) {
		
	}
	
	private static void testChangeReadOnly(){
		////1.����2��list��������2��list�ķ���Ȩ��δ�������á�
		List<StringBuilder> modifyList = new ArrayList<>(); 
		List<StringBuilder> normalList= new LinkedList<>();
		//2.��modifylist�в���Ԫ�ء�
		modifyList.add(new StringBuilder("you"));
		modifyList.add(new StringBuilder("are"));
		modifyList.add(new StringBuilder("boy"));
		//3.���ÿɶ�Ȩ��
		modifyList = Collections.unmodifiableList(modifyList);
		//4.��ֻ����modifyList�е����ø��Ƶ�normalList�С�
		normalList.addAll(modifyList);
		//5.��normalList�в������ݡ�
		normalList.add(new StringBuilder("hello"));
		System.out.println(normalList.toString());
		
		//6.����ֻ��list�У�������ָ��Ķ����ֵ��
		System.out.println("����֮ǰ ----> " + modifyList.toString());
		//����
		modifyList.get(1).append("~~~~~");
		System.out.println("����֮�� ----> " + modifyList.toString());
	}
	
	private static void testReadOnly(){
		//1.����һ��list���������list�ķ���Ȩ��δ�������á�
		List<String> modifyList = new ArrayList<>(); 
		//2.�����в�����ص����ݡ������С�
		modifyList.add("you");
		modifyList.add("are");
		modifyList.add("boy");
		//3.��list�������á�ʹ֮�ɶ���
		modifyList = Collections.unmodifiableList(modifyList);
		//4.�ڴβ��룬���ִ���
		modifyList.add("hello");
	}
	private static void testArray(){
		
	}

}
