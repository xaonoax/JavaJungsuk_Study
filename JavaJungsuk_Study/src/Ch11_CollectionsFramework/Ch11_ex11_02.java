package Ch11_CollectionsFramework;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Ch11_ex11_02 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();  // Queue인터페이스의 구현체
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while (!st.empty()) {
			System.out.println(st.pop());  // 스택에서 요소를 하나 꺼냄
		}
		
		System.out.println("= Queue =");
		while (!q.isEmpty()) {
			System.out.println(q.poll());  // 큐에서 요소를 하나 꺼냄
		}
	}

}
