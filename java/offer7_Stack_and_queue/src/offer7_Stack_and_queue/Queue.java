package offer7_Stack_and_queue;

import java.util.Stack;
//用两个栈实现队列
public class Queue {
	private Stack stack1 = new Stack();
	private Stack stack2 = new Stack();
	
	public void push(Object item){
		stack1.push(item);
	}
	
	public Object pop(){
		
		if(stack2.empty()){			
			while(!stack1.empty()){			
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
}
