package Ch12_Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Ch12_ex12_02 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바킹", 1, 2));
		list.add(new Student("왕자바", 2, 1));
		
		Iterator<Student> it = list.iterator();
//		Iterator it = list.iterator();
		while (it.hasNext()) {
//			Student s = (Student)it.next();  // 지네릭스를 사용하지 않으면 형변환 필요
//			Student s = it.next();
//			System.out.println(s.name);
			System.out.println(it.next().name);  // 한 줄로 줄일 수 있음
		}
	}

}

class Student {
	String name = "";
	int ban;  // 반
	int no;  // 번호
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}