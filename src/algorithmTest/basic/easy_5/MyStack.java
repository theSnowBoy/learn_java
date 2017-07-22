package algorithmTest.basic.easy_5;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> main = new LinkedList<Integer>();
	Queue<Integer> back = new LinkedList<Integer>();
	Queue<Integer> tmp = null;
	
	/** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        main.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(main.size()>1){
        	back.add(main.poll());
        }
        int result = main.poll();
        back2main();
        return result;
    }
    
    /** Get the top element. */
    public int top() {
    	while(main.size()>1){
        	back.add(main.poll());
        }
    	int result = main.poll();
    	back.add(result);
    	back2main();
    	return result;
    }
    
    private void back2main(){
    	tmp = main;
        main = back;
        back = tmp;
        tmp =null;
    }
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return main.isEmpty();
    }
}
