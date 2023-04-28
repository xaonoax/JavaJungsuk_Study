package Ch12_Generics;

import java.util.ArrayList;

public class Ch12_ex12_GenericTest2 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		ArrayList<Tv> list = new ArrayList<Tv>();  // Tv타입의 객체만 저장 가능
												   // 참조변수에 대입된 타입과 생성자에 대입된 타입이 같아야 함.
		list.add(new Tv());
//		list.add(new Audio());
		
//		Tv t = (Tv)list.get(0);  // 지네릭 사용 X
		Tv t = list.get(0);		 // 지네릭 사용 O
	}

}

class Tv {}
class Audio {}