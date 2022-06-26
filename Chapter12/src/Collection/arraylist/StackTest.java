package Collection.arraylist;

import java.util.ArrayList;

class MyStack{

	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		
		int len = arrayStack.size();		// len = length
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		String data = arrayStack.remove(arrayStack.size() -1);
		return data;
		
	}
	
	
}

public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack= new MyStack();
	
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		
	}
}
