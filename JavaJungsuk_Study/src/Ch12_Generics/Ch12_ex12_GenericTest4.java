package Ch12_Generics;

import java.util.ArrayList;

public class Ch12_ex12_GenericTest4 {

	public static void main(String[] args) {
		FruitBox4<? extends Fruit> fbox = (FruitBox4<? extends Fruit>)new FruitBox4<Fruit>();
		// FruitBox4<Apple> -> FruitBox<? extends Fruit>
		FruitBox4<? extends Apple> abox = new FruitBox4<Apple>();  // 형변환 생략
		
		// FruitBox4<? extends Fruit> -> FruitBox<Apple>로 가능?
		FruitBox4<Apple> appleBox = (FruitBox4<Apple>)abox;  // OK지만 경고발생
	}

}

class Fruit4 implements Eatable {
	public String toString() { return "Fruit"; }
}
class Apple4 extends Fruit { public String toString() { return "Apple";}}
class Grape4 extends Fruit { public String toString() { return "Grape";}}
class Toy4 { public String toString() { return "Toy";}}

interface Eatable4 {}

class FruitBox4<T extends Fruit & Eatable> extends Box<T> {}  // 인터페이스를 같이 쓸 땐 , 사용 안 됨 & 써야함

class Box4<T> {
	ArrayList<T> list = new ArrayList<T>();  // item을 저장할 list
	void add(T item) { list.add(item); }  // 박스에 item을 추가
	T get(int i) { return list.get(i); }  // 박스에서 item을 꺼낼 때
	int size() {return list.size(); }
	public String toString() { return list.toString(); }
}