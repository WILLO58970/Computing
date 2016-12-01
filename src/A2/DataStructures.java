package A2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DataStructures {

	public static void main(String[] args) {

		//Instantiation
		String[]a = {"0","1","2","3","4","5","6","7","8","9","10"};
		List<String>list = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();
		Queue<String>queue = new LinkedList<String>();

		//Populate Data Structures
		for(int i = 0;i<5;i++){
			queue.add(""+(int)(Math.random()*100));
			stack.add(""+(int)(Math.random()*100));
			list.add(""+(int)(Math.random()*100));
		}

		//Access Elements
		System.out.println((int)(Math.random()*a.length-1));
		System.out.println(list.get(0));
		System.out.println(stack.get(0));
		System.out.println(queue.element());

		//Remove Elements
		a[(int)(Math.random()*a.length-1)] = null;
		list.remove(0);
		stack.remove(stack.size()-1);
		queue.remove();
	}
}
