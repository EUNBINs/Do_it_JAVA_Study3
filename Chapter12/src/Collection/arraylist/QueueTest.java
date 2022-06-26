package Collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		
		return arrayQueue.remove(0);
		
	}
}
public class QueueTest {

	public static void main(String[] args) {
		MyQueue Queue= new MyQueue();
		
		Queue. enQueue("a");
		Queue.enQueue("b");
		Queue.enQueue("c");
		
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		
		System.out.println(Queue.deQueue());

	}

}
