package javaTest.collectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("hello");
		l.add("you");
		l.add("hello");
		l.add("hello");
//		testForError(l);
//		deleteElementDuringVisit(l);
//		deleteWhenIterate(l);
//		clearList(l);
		removeAllRelated2(l);
	}
	
	
	//clear all the "hello"
	public static void removeAllRelated1(List<String> l){
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			if(it.next().equals("hello")){
				it.remove();
			}
		}
		System.out.println(l);
	}
	
	public static void removeAllRelated2(List<String> l){
		Iterator<String> it = l.iterator();
		List<String> tobeDeleted = new ArrayList<String>();
		while(it.hasNext()){
			String tmp = it.next();
			if(tmp.equals("hello")){
				tobeDeleted.add(tmp);
			}
		}
		
		l.removeAll(tobeDeleted);
		System.out.println(l);
	}
	
	//clear之后只是将list 的元素清空，但是list并不是变成 null.
	public static void clearList(List<String> l){
		l.clear();
		System.out.println("the size is : " + l.size());
	}
	
	//在迭代时候删除元素。
	public static void deleteWhenIterate(List<String> l){
		Iterator<String> it = l.iterator();
		int i = 0 ;
		while(it.hasNext()){
			it.next();
			if(i <= 1){
			it.remove();	
			}
			
			i++;
		}
		System.out.println(l);
	}
	
	//删除第一个hello.
	public static void dropFirstTest(List<String> l){
		System.out.println("drop first hello:");
		l.remove("hello");
		System.out.println(l);
	}
	
	//删除最后一个hello.
	public static void dropLastTest(List<String> l){
		System.out.println("drop last hello:");
		l.remove(l.lastIndexOf("hello"));
		System.out.println(l);
	}
	
	//删除中间某个hello.通过计数的方式，在程序中实现。（删除第二个hello）【不写】
	
	//通过迭代器（Iterator）遍历列表
	public static void seeAllWithIterator(List<String> l){
		System.out.println("iterator :");
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	//通过for循环来实现遍历
	public static void seeAllWithFor(List<String> l){
		System.out.println("see all with for cycle :");
		for(int i =0;i < l.size();i++){
			System.out.println(l.get(i));
		}
	}
	
	public static void deleteElementDuringVisit(List<String> l){
		for(int i =0;i < l.size();i++){
			if(l.get(i).equals("you")){
				l.remove(i);
				i--;
				continue;
			}
			System.out.println(l.get(i));
		}
	}
	
	
	//关于for循环存在的缺陷。
	public static void testForError(List<String> l){
		
		//尝试在for 循环中跳过you.
		//模拟在遍历过程中插入的场景。
		System.out.println("some error with for cycle :");
		//l.size()每次都会重新算一遍。
		//l中一旦把某个元素删除了，后面的就会补上去。
		for(int i =0;i < l.size();i++){
			if(i == 0){
				l.remove(i);
//				l.add("added");
				continue;
			}
			System.out.println(l.get(i));
		}
	}
}

