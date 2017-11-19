package spring.demo;

public class POJO {
	
	
public interface HelloImp{
	public void A1();
	public void A2();
	public void sayHello();
}
public class Hello implements HelloImp{

	@Override
	public void A1() {//不需要实现的。
		
	}

	@Override
	public void A2() {
		
	}

	@Override
	public void sayHello() {
		System.out.println("hello world");//我真正需要实现的。
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
		this.h = out; // 通过参数传入，将创建的任务交由外界，从而降低了Person 与 HelloImp耦合性。
	}
	public void say(){
		//要想记录日志，需要手动将日志记录的代码插入到被记录的类中。
		//这种硬编码的方式，让程序的灵活性全无。
		log.recordBefore();
		this.h.sayHello();
		log.recordAfter();
	}
}
}
