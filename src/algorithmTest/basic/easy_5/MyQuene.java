package algorithmTest.basic.easy_5;

import java.awt.List;
import java.util.LinkedList;
import java.util.Stack;

public class MyQuene {
	
    /** Initialize your data structure here. */
    public MyQuene() {
        
    }
    Stack<Integer> in = new Stack<Integer>();
	Stack<Integer> out = new Stack<Integer>();
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(out.isEmpty()){
        	in2out();
        }
        return out.pop();
    }
    private void in2out(){
    	while(!in.isEmpty()){
    		out.push(in.pop());
    	}
    }
    
    /** Get the front element. */
    public int peek() {
    	if(out.isEmpty()){
        	in2out();
        }
        return out.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (in.size()+out.size())==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
