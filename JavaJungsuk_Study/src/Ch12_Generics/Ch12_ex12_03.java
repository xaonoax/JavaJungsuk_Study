package Ch12_Generics;

import java.util.ArrayList;

public class Ch12_ex12_03 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>();  // 에러 타입 불일치
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();  // 에러 제약조건
		Box<Toy> toyBox = new Box<Toy>();  // OK
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러 Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());
	}

}

class Fruit implements Eatable {
	public String toString() { return "Fruit"; }
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy { public String toString() { return "Toy";}}

interface Eatable {}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}  // 인터페이스를 같이 쓸 땐 , 사용 안 됨 & 써야함

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();  // item을 저장할 list
	void add(T item) { list.add(item); }  // 박스에 item을 추가
	T get(int i) { return list.get(i); }  // 박스에서 item을 꺼낼 때
	int size() {return list.size(); }
	public String toString() { return list.toString(); }
}