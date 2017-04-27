package offer7_Stack_and_queue;
/**
 * 
 * @author 501jjp
 * 用两个栈实现队列
 */
public class StackToQueue {
	public static void main(String [] args){
		Queue list = new Queue();
		
		for(int i=0;i<10;i++){
			list.push(i);
		}
		
		for(int i=0;i<10;i++){
			System.out.print((int)list.pop()+" ");
		}
	}
}
