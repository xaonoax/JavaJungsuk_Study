package Ch12_Generics;

import java.util.ArrayList;

public class Ch12_ex12_GenericTest3 {

	public static void main(String[] args) {
//		Box b = null;
		Box<String> b = new Box<String>();  // 꼭 이렇게 쓸 것
//		b.add(new Integer(100));
		Box<String> bStr = null;
		
		b = (Box)bStr;  // Box<String> -> Box, 가능하지만 경고 발생
		bStr = (Box<String>)b;  // Box -> Box<String>, 가능하지만 경고 발생
	
	}

}

class Fruit3 implements Eatable {
	public String toString() { return "Fruit"; }
}
class Apple3 extends Fruit { public String toString() { return "Apple";}}
class Grape3 extends Fruit { public String toString() { return "Grape";}}
class Toy3 { public String toString() { return "Toy";}}

interface Eatable3 {}

class FruitBox3<T extends Fruit & Eatable> extends Box<T> {}  // 인터페이스를 같이 쓸 땐 , 사용 안 됨 & 써야함

class Bo3x<T> {
	ArrayList<T> list = new ArrayList<T>();  // item을 저장할 list
	void add(T item) { list.add(item); }  // 박스에 item을 추가
	T get(int i) { return list.get(i); }  // 박스에서 item을 꺼낼 때
	int size() {return list.size(); }
	public String toString() { return list.toString(); }
}