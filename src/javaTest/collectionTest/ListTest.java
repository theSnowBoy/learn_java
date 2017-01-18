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
	
	//clear֮��ֻ�ǽ�list ��Ԫ����գ�����list�����Ǳ�� null.
	public static void clearList(List<String> l){
		l.clear();
		System.out.println("the size is : " + l.size());
	}
	
	//�ڵ���ʱ��ɾ��Ԫ�ء�
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
	
	//ɾ����һ��hello.
	public static void dropFirstTest(List<String> l){
		System.out.println("drop first hello:");
		l.remove("hello");
		System.out.println(l);
	}
	
	//ɾ�����һ��hello.
	public static void dropLastTest(List<String> l){
		System.out.println("drop last hello:");
		l.remove(l.lastIndexOf("hello"));
		System.out.println(l);
	}
	
	//ɾ���м�ĳ��hello.ͨ�������ķ�ʽ���ڳ�����ʵ�֡���ɾ���ڶ���hello������д��
	
	//ͨ����������Iterator�������б�
	public static void seeAllWithIterator(List<String> l){
		System.out.println("iterator :");
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	//ͨ��forѭ����ʵ�ֱ���
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
	
	
	//����forѭ�����ڵ�ȱ�ݡ�
	public static void testForError(List<String> l){
		
		//������for ѭ��������you.
		//ģ���ڱ��������в���ĳ�����
		System.out.println("some error with for cycle :");
		//l.size()ÿ�ζ���������һ�顣
		//l��һ����ĳ��Ԫ��ɾ���ˣ�����ľͻᲹ��ȥ��
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

