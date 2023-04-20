package Ch09_Class;

import java.util.ArrayList;

public class Ch09_ex9_RoundTest2 {

	public static void main(String[] args) {
//		int i = Integer.parseInt("100");
		System.out.println("i=" + Integer.parseInt("100"));
		System.out.println("i=" + Integer.parseInt("100", 10));  // 위와 동일
		System.out.println("i=" + Integer.parseInt("100", 2));   // 2진수
		System.out.println("i=" + Integer.parseInt("FF", 16));   // 16진수
		
		// 오토박싱, 언박싱
		ArrayList<Integer> list = new ArrayList<Integer>();  // 객체만 저장 가능
		list.add(new Integer(100));  // list에는 객체만 추가 가능
		list.add(100);  // 오토박싱 JDK1.5 이전에는 에러
		
//		Integer i = list.get(0);  // list에 저장된 첫번째 객체를 꺼낸다.
//		int i = list.get(0).intValue();  // intValue()로 Integer를 int로 변환
		int i = list.get(0);  // 언박싱
	}

}
