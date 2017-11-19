package spring.demo;

public class POJO {
	
	
public interface HelloImp{
	public void A1();
	public void A2();
	public void sayHello();
}
public class Hello implements HelloImp{

	@Override
	public void A1() {//����Ҫʵ�ֵġ�
		
	}

	@Override
	public void A2() {
		
	}

	@Override
	public void sayHello() {
		System.out.println("hello world");//��������Ҫʵ�ֵġ�
	}
}
public class MyLog{
	public void recordBefore(){
		System.err.println("before");
	}
	public void recordAfter(){
		System.out.println("after");
	}
}

public class Person{
	private HelloImp h;
	private MyLog log;
	public Person(HelloImp out){
		this.h = out; // ͨ���������룬����������������磬�Ӷ�������Person �� HelloImp����ԡ�
	}
	public void say(){
		//Ҫ���¼��־����Ҫ�ֶ�����־��¼�Ĵ�����뵽����¼�����С�
		//����Ӳ����ķ�ʽ���ó���������ȫ�ޡ�
		log.recordBefore();
		this.h.sayHello();
		log.recordAfter();
	}
}
}
