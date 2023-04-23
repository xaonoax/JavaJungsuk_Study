package Ch11_CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Ch11_ex11_01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// ArrayList(Collection c)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// Collection은 인터페이스, Collections는 유틸 클래스
		Collections.sort(list1);  // list1과 list2를 정렬한다.
		Collections.sort(list2);  // Collections.sort(List 1)
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
		// indexOf()는 지정된 객체의 위치(인덱스)를 알려줌
		System.out.println("index=" + list1.indexOf("1"));
//		list1.remove(5);  // 인덱스가 5인 객체를 삭제
		list1.remove(new Integer(4));  // 4를 삭제
		
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
